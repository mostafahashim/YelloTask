package yello.receiver.ui.activity.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import yello.receiver.R
import yello.receiver.databinding.ActivitySplashBinding
import yello.receiver.ui.activity.baseActivity.BaseActivity
import yello.receiver.ui.activity.main.MainActivity

class SplashActivity : BaseActivity(
    R.string.app_name, false, false, false,
    false, false, false, false, false,
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