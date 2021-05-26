package yello.receiver.ui.activity.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import yello.data.local.UserModelDAO
import yello.receiver.MyApplication
import yello.data.model.UserModel
import yello.receiver.observer.OnRecyclerItemClickListener
import yello.receiver.ui.activity.baseActivity.BaseActivityViewModel
import yello.receiver.ui.adapter.RecyclerUserAdapter

class MainViewModel(
    application: MyApplication
) : BaseActivityViewModel(application) {
    lateinit var observer: Observer
    val userModelDAO: UserModelDAO = db.userModelDAO()
    var compositeDisposable = CompositeDisposable()

    var isShowNoData = MutableLiveData<Boolean>()
    var connectionErrorMessage = ""

    var userModels: ArrayList<UserModel>? = ArrayList()
    var recyclerUserAdapter: RecyclerUserAdapter

    init {
        isShowNoData.value = false

        recyclerUserAdapter = RecyclerUserAdapter(
            userModels!!, object : OnRecyclerItemClickListener {
                override fun onRecyclerItemClickListener(position: Int) {
                }

            })
        getLocalUsers()
    }

    fun getLocalUsers() {
        compositeDisposable.add(userModelDAO.getUserModels()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
            }.subscribe({ userModelsList ->
                if (!userModelsList.isNullOrEmpty()) {
                    isShowNoData.value = false
                    userModels = userModelsList.toCollection(ArrayList())
                    recyclerUserAdapter.setList(userModels!!)
                }else{
                    isShowNoData.value = true
                }
            }, {
                Log.i("DBError", it?.message!!)
            })
        )
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

    interface Observer {
    }

}