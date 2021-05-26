package yello.receiver.ui.activity.baseActivity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import yello.receiver.MyApplication

class BaseViewModelFactory(
    var application: MyApplication
) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BaseActivityViewModel(application) as T
    }
}