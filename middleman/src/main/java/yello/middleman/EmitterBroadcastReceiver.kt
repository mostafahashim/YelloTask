package yello.middleman

import android.content.*
import android.os.*
import android.widget.Toast
import yello.data.model.UserModel


class EmitterBroadcastReceiver : BroadcastReceiver(), ServiceConnection {
    private var messenger: Messenger? = null
    private var isBound = false


    private var connection //receives callbacks from bind and unbind invocations
            : ServiceConnection? = null
    private var replyTo: Messenger? = null
    lateinit var context: Context

    override fun onReceive(ctxt: Context?, intent: Intent?) {
        context = ctxt!!
        if (intent?.action != null && intent.action?.compareTo("receiveFromEmitter") == 0) {
            connection = this
            replyTo = Messenger(IncomingHandler(context))
            if (!intent.hasExtra("UserModel"))
                return
            var userModel = intent.extras?.get("UserModel") as UserModel
            //Bind to the remote service
            val intentBinder = Intent()
            intentBinder.setClassName(
                "yello.receiver",
                "yello.receiver.RemoteService"
            )
            context.applicationContext.bindService(
                intentBinder,
                connection!!,
                Context.BIND_AUTO_CREATE
            )
            sendDataToServer(context, userModel)
        }
    }

    fun sendDataToServer(context: Context, userModel: UserModel) {
        Handler(Looper.getMainLooper()).postDelayed({
            if (isBound) {
                //Setup the message for invocation
                val bundle = Bundle()
                bundle.putSerializable("UserModel", userModel)
                val message = Message.obtain(null, 0, 0, 0, bundle)
                try {
                    //Set the ReplyTo Messenger for processing the invocation response
                    message.replyTo = replyTo
                    //Make the invocation
                    messenger!!.send(message)
                } catch (rme: RemoteException) {
                    //Show an Error Message
                    Toast.makeText(context, "Invocation Failed!!", Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                Toast.makeText(context, "Service is Not Bound!!", Toast.LENGTH_LONG)
                    .show()
            }
        }, 1000)
    }

    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
        messenger = Messenger(service)
        isBound = true
    }

    override fun onServiceDisconnected(name: ComponentName?) {
        messenger = null
        isBound = false
    }

    private class IncomingHandler(var context: Context) : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            val bundle = msg.obj as Bundle
            var result = bundle.getString("Result")
            var userModel = bundle.getSerializable("UserModel") as UserModel
            Intent().run {
                action = "receiveFromMiddleMan"
                putExtra("UserModel", userModel)
                putExtra("Result", result)
                addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
                component =
                    ComponentName(
                        "yello.emitter",
                        "yello.emitter.MiddleManBroadcastReceiver"
                    )
                context.sendBroadcast(this)
            }
        }
    }
}