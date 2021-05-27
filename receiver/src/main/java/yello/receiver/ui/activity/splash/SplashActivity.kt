package yello.receiver.ui.activity.splash

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import yello.data.model.UserModel
import yello.receiver.R
import yello.receiver.databinding.ActivitySplashBinding
import yello.receiver.observer.OnAskUserAction
import yello.receiver.ui.activity.baseActivity.BaseActivity
import yello.receiver.ui.activity.main.MainActivity
import yello.receiver.util.showMessage

class SplashActivity : BaseActivity(
    R.string.app_name, false, true, true,
    false, false, false, false, true,
),SplashViewModel.Observer {

    lateinit var binding: ActivitySplashBinding
    override fun doOnCreate(arg0: Bundle?) {
        binding = putContentView(R.layout.activity_splash) as ActivitySplashBinding
        binding.viewModel =
            ViewModelProvider(
                this,
                SplashViewModelFactory(application)
            )
                .get(SplashViewModel::class.java)
        binding.viewModel!!.baseViewModelObserver = baseViewModelObserver
        binding.viewModel!!.observer = this
        binding.lifecycleOwner = this
        initializeViews()
        setListener()
    }

    override fun initializeViews() {
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
            this, userModel.name!!, getString(R.string.new_user_received_from_middleman),
            object : OnAskUserAction {
                override fun onPositiveAction() {
                }

                override fun onNegativeAction() {
                }

            }, false, getString(R.string.no_connection),
            getString(R.string.ok), true
        )
    }

    override fun setListener() {

    }

    override fun openMainScreen() {
        Intent(this@SplashActivity, MainActivity::class.java).run {
            startActivity(this)
            overridePendingTransition(R.anim.slide_from_right_to_left, R.anim.slide_in_left)
        }
    }

}