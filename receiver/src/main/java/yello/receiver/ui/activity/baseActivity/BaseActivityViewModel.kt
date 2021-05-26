package yello.receiver.ui.activity.baseActivity

import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import yello.data.local.AppDatabase
import yello.receiver.MyApplication

open class BaseActivityViewModel(
    var application: MyApplication
) : AndroidViewModel(application) {
    lateinit var baseViewModelObserver: BaseViewModelObserver
    var db: AppDatabase = Room.databaseBuilder(
        application.applicationContext,
        AppDatabase::class.java,
        "YelloDB"
    ).build()

    init {
    }

    fun onButtonBackClicked() {
        baseViewModelObserver.onBackButtonClicked()
    }

    fun onButtonMenuClicked() {
        baseViewModelObserver.onMenuButtonClicked()
    }

    fun onButtonAny2Clicked() {
        baseViewModelObserver.onAny2ButtonClicked()
    }

    fun onSearchClicked() {
        baseViewModelObserver.onSearchClicked()
    }

    interface BaseViewModelObserver {
        fun onBackButtonClicked()
        fun onMenuButtonClicked()
        fun onAny1ButtonClicked()
        fun onAny2ButtonClicked()
        fun onSearchClicked()
        fun onLoginAgain()
        fun onRestartApp(message: Int)
        fun openLoginToUseFeature()
    }
}