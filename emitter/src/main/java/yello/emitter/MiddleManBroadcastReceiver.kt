package yello.emitter

import android.content.*
import android.os.*
import android.widget.Toast
import yello.data.model.UserModel
import yello.emitter.ui.activity.main.MainActivity

class MiddleManBroadcastReceiver : BroadcastReceiver() {
    lateinit var context: Context

    override fun onReceive(ctxt: Context?, intent: Intent?) {
        context = ctxt!!
        if (intent?.action != null && intent.action?.compareTo("receiveFromMiddleMan") == 0) {
            if (!intent.hasExtra("UserModel") && !intent.hasExtra("Result"))
                return
            Intent(context, MainActivity::class.java).run {
                var bundle = intent.extras ?: Bundle()
                putExtras(bundle)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                context.startActivity(this)
            }
        }
    }
}