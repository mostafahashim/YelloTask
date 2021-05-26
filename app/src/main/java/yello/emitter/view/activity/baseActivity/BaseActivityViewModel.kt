package yello.emitter.view.activity.baseActivity

import androidx.lifecycle.AndroidViewModel
import yello.emitter.MyApplication
import yello.emitter.util.Preferences
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

open class BaseActivityViewModel(
    var application: MyApplication
) : AndroidViewModel(application) {
    lateinit var baseViewModelObserver: BaseViewModelObserver

    var baseCompositeDisposable = CompositeDisposable()

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



    fun clearAppPreferencesAndDB() {
        baseCompositeDisposable.add(Observable.fromCallable {
            Preferences.clearUserData()
        }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
            }
            .subscribe(
                {
                },
                { }
            ))
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