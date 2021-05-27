package yello.receiver.ui.activity.main

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.webkit.*
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_error.*
import yello.data.model.UserModel
import yello.receiver.R
import yello.receiver.databinding.ActivityMainBinding
import yello.receiver.observer.OnAskUserAction
import yello.data.remote.setup.isInternetAvailable
import yello.receiver.ui.activity.baseActivity.BaseActivity
import yello.receiver.util.ActivityUtils
import yello.receiver.util.showMessage


class MainActivity : BaseActivity(
    R.string.app_name, false, true, true,
    false, false, false, false, true,
), MainViewModel.Observer {

    lateinit var binding: ActivityMainBinding
    override fun doOnCreate(arg0: Bundle?) {
        binding = putContentView(R.layout.activity_main) as ActivityMainBinding
        binding.viewModel =
            ViewModelProvider(
                this,
                MainViewModelFactory(application)
            )
                .get(MainViewModel::class.java)
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

}