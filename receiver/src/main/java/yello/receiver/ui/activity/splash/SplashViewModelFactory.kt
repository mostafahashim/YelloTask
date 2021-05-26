package yello.receiver.ui.activity.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import yello.receiver.MyApplication

class SplashViewModelFactory(
    var application: MyApplication
) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SplashViewModel(application) as T
    }
}