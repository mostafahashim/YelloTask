package yello.receiver.ui.activity.splash
import yello.receiver.MyApplication
import yello.receiver.ui.activity.baseActivity.BaseActivityViewModel

class SplashViewModel(
    application: MyApplication
) : BaseActivityViewModel(application) {
    lateinit var observer: Observer

    init {

    }

    override fun onCleared() {
        super.onCleared()
    }

    interface Observer {
        fun openMainScreen()
    }

}