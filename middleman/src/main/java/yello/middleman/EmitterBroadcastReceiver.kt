package yello.middleman

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import yello.middleman.ui.MainActivity

class EmitterBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action != null && intent.action?.compareTo("receiveFromEmitter") == 0) {
            Intent(context, MainActivity::class.java).run {
                var bundle = intent.extras ?: Bundle()
                putExtras(bundle)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                context?.startActivity(this)
            }
        }
    }
}