package yello.receiver

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.*
import android.util.Log
import android.widget.Toast
import androidx.room.Room
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import yello.data.local.AppDatabase
import yello.data.local.UserModelDAO
import yello.data.model.UserModel
import yello.receiver.ui.activity.main.MainActivity
import yello.receiver.ui.activity.splash.SplashActivity

class RemoteService : Service() {

    private var messenger: Messenger? = null

    override fun onBind(intent: Intent?): IBinder? {
        if (messenger == null) {
            synchronized(RemoteService::class.java) {
                if (messenger == null) {
                    messenger = Messenger(IncomingHandler(this@RemoteService))
                }
            }
        }
        //Return the proper IBinder instance
        return messenger!!.binder
    }

    private class IncomingHandler(var context: Context) : Handler() {
        var db: AppDatabase = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "YelloDB"
        ).build()
        val userModelDAO: UserModelDAO = db.userModelDAO()
        var compositeDisposable = CompositeDisposable()
        lateinit var replyTo: Messenger
        lateinit var userModel: UserModel
        override fun handleMessage(msg: Message) {
            this.replyTo = msg.replyTo
            val bundle = msg.obj as Bundle
            userModel = bundle.getSerializable("UserModel") as UserModel
            //open home screen to show received data
            Intent(context, SplashActivity::class.java).run {
                putExtras(bundle)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                context.startActivity(this)
            }
            saveUserToLocalDB(userModel)
        }

        fun sendReplyMessage(isSaved: Boolean) {
            //Setup the reply message
            val bundle = Bundle()
            bundle.putString("Result", if (isSaved) "OK" else "NOK")
            bundle.putSerializable("UserModel", userModel)
            val messageToSend = Message.obtain(null, if (isSaved) 1 else -1, 0, 0, bundle)
            try {
                //make the RPC invocation
                val replyTo = replyTo
                replyTo.send(messageToSend)
            } catch (rme: RemoteException) {
                //Show an Error Message
                Toast.makeText(context, "Invocation Failed!!", Toast.LENGTH_LONG).show()
            }
        }

        fun saveUserToLocalDB(userModel: UserModel) {
            compositeDisposable.add(
                //delete current tabs then insert tabs
                userModelDAO.insertUserModel(userModel)
                    .doOnError {
                        Log.i("DBError", it?.message!!)
                        sendReplyMessage(false)
                    }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        {
                            sendReplyMessage(true)
                        }, {
//                            Log.i("DBError", it?.message!!)
//                            sendReplyMessage(false)
                        }
                    )
            )
        }
    }
}