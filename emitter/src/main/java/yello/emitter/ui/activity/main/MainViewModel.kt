package yello.emitter.ui.activity.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import yello.emitter.MyApplication
import yello.emitter.R
import yello.data.model.UserModel
import yello.emitter.observer.OnRecyclerItemClickListener
import yello.data.remote.JsonParser
import yello.data.remote.URL
import yello.data.remote.remoteService.RemoteCallback
import yello.data.remote.remoteService.startGetMethodUsingCoroutines
import yello.data.remote.setup.getDefaultParams
import yello.emitter.ui.activity.baseActivity.BaseActivityViewModel
import yello.emitter.ui.adapter.RecyclerUserAdapter

class MainViewModel(
    application: MyApplication
) : BaseActivityViewModel(application) {
    lateinit var observer: Observer
    var isShowLoader = MutableLiveData<Boolean>()
    var isShowError = MutableLiveData<Boolean>()
    var isShowRefresh = MutableLiveData<Boolean>()
    var isShowNoData = MutableLiveData<Boolean>()
    var connectionErrorMessage = ""

    var userModels: ArrayList<UserModel>? = ArrayList()
    var recyclerUserAdapter: RecyclerUserAdapter

    init {
        isShowError.value = false
        isShowLoader.value = false
        isShowRefresh.value = false
        isShowNoData.value = false

        recyclerUserAdapter = RecyclerUserAdapter(
            userModels!!, object : OnRecyclerItemClickListener {
                override fun onRecyclerItemClickListener(position: Int) {
                    observer.sendUserData(userModels!![position])
                }

            })
        getHomeDataApi()
    }

    fun getHomeDataApi() {
        var params = getDefaultParams(HashMap())

        viewModelScope.launch {
            startGetMethodUsingCoroutines(
                URL.getUsersUrl(),
                params,
                object : RemoteCallback {
                    override fun onStartConnection() {
                        isShowLoader.value = true
                        isShowError.value = false
                        isShowRefresh.value = false
                        isShowNoData.value = false
                    }

                    override fun onFailureConnection(errorMessage: Any?) {
                        try {
                            Log.i("ApiError", errorMessage.toString())
                            isShowLoader.value = false
                            if (errorMessage != null) {
                                connectionErrorMessage = errorMessage.toString()
                            } else {
                                connectionErrorMessage =
                                    application.context.getString(R.string.something_went_wrong_please_try_again_)
                            }
                        } catch (e: Exception) {
                            connectionErrorMessage =
                                application.context.getString(R.string.something_went_wrong_please_try_again_)
                        }
                        isShowError.value = true
                    }

                    override fun onSuccessConnection(response: Any?) {
                        isShowLoader.value = false
                        try {
                            var responseModel =
                                JsonParser().getUserModelsResponseModel(response.toString())
                            if (responseModel != null) {
                                if (responseModel.isNotEmpty()) {
                                    userModels = responseModel
                                    recyclerUserAdapter.setList(userModels!!)
                                } else {
                                    isShowNoData.value = true
                                }
                            } else {
                                connectionErrorMessage =
                                    application.context.getString(R.string.something_went_wrong_please_try_again_)
                                isShowError.value = true
                            }
                        } catch (e: Exception) {
                            connectionErrorMessage =
                                application.context.getString(R.string.something_went_wrong_please_try_again_)
                            isShowError.value = true
                        }
                    }

                    override fun onLoginAgain(errorMessage: Any?) {
                    }
                })
        }
    }

    override fun onCleared() {
        super.onCleared()
    }

    interface Observer {
        fun sendUserData(userModel: UserModel)
    }

}