package yello.emitter.ui.activity.main

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
import yello.emitter.R
import yello.emitter.databinding.ActivityMainBinding
import yello.emitter.observer.OnAskUserAction
import yello.data.remote.setup.isInternetAvailable
import yello.emitter.ui.activity.baseActivity.BaseActivity
import yello.emitter.util.ActivityUtils
import yello.emitter.util.showMessage


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
        ActivityUtils.setSwipeRefreshLayoutColor(
            this,
            binding.swipeRefreshHomeFragment
        )

        //permission to start from background
        requestPermission()
        if (intent?.extras != null && intent?.hasExtra("UserModel")!!
            && intent?.hasExtra("Result")!!
        ) {
            var userModel = intent?.extras?.get("UserModel") as UserModel
            var result = intent?.extras?.getString("Result")
            showReceivedUserData(userModel, result!!)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent?.extras != null && intent?.hasExtra("UserModel")!!
            && intent?.hasExtra("Result")!!
        ) {
            var userModel = intent?.extras?.get("UserModel") as UserModel
            var result = intent?.extras?.getString("Result")
            showReceivedUserData(userModel, result!!)
        }
    }

    fun showReceivedUserData(userModel: UserModel, result: String) {
        showMessage(
            this, userModel.name!!, result,
            object : OnAskUserAction {
                override fun onPositiveAction() {
                }

                override fun onNegativeAction() {
                }

            }, false, getString(R.string.no_text),
            getString(R.string.ok), true
        )
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

    override fun setListener() {
        binding.viewModel!!.isShowError.removeObservers(this@MainActivity)
        binding.viewModel!!.isShowError.observe(this@MainActivity, Observer {
            if (it && lifecycle.currentState == Lifecycle.State.RESUMED) {
                binding.layoutError.ivError.setImageResource(
                    if (isInternetAvailable(this@MainActivity))
                        R.drawable.error_ice_creame_icon else R.drawable.error_router_connection_icon
                )
                binding.layoutError.tvErrorTitleConnection.text =
                    if (isInternetAvailable(this@MainActivity))
                        getString(R.string.oh_no) else getString(R.string.you_are_offline)
                binding.layoutError.tvErrorBodyConnection.text =
                    if (isInternetAvailable(this@MainActivity))
                        binding.viewModel!!.connectionErrorMessage else getString(R.string.no_internet_connection)
            }
        })

        binding.layoutError.tvRetry.setOnClickListener {
            binding.viewModel!!.getHomeDataApi()
        }

        binding.recyclerView.addOnScrollListener(object :
            RecyclerView.OnScrollListener() {

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val pastVisibleItems =
                    (recyclerView.layoutManager as GridLayoutManager).findFirstCompletelyVisibleItemPosition()
                //first item
                binding.swipeRefreshHomeFragment.isEnabled = pastVisibleItems == 0
            }
        })

    }

    override fun sendUserData(userModel: UserModel) {
        showMessage(
            this, userModel.name!!, getString(R.string.send_messege),
            object : OnAskUserAction {
                override fun onPositiveAction() {
                    Intent().run {
                        action = "receiveFromEmitter"
                        putExtra("UserModel", userModel)
                        addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
                        component =
                            ComponentName(
                                "yello.middleman",
                                "yello.middleman.EmitterBroadcastReceiver"
                            )
                        sendBroadcast(this)
                    }
                }

                override fun onNegativeAction() {
                }

            }, true, getString(R.string.cancel_underline),
            getString(R.string.send), true
        )
    }

}