package yello.middleman.ui

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import yello.data.model.UserModel
import yello.middleman.R
import yello.middleman.observer.OnAskUserAction
import yello.middleman.util.showMessage


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestPermission()

        if (intent?.extras != null && intent?.hasExtra("UserModel")!!) {
            var userModel = intent?.extras?.get("UserModel") as UserModel
            showUserData(userModel)
        }
    }

    private fun requestPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                val intent = Intent(
                    Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + this.packageName)
                )
                startActivityForResult(intent, 0)
            } else {
                //Permission Granted-System will work
            }
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        var userModel = intent?.extras?.get("UserModel") as UserModel
        showUserData(userModel)
    }

    fun showUserData(userModel: UserModel) {
        showMessage(
            this, userModel.name!!, getString(R.string.send_messege),
            object : OnAskUserAction {
                override fun onPositiveAction() {
                }

                override fun onNegativeAction() {
                }

            }, true, getString(R.string.cancel_underline),
            getString(R.string.send), true
        )
    }
}