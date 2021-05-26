package yello.emitter.remote.setup

import yello.emitter.util.Preferences
import okhttp3.MultipartBody
import kotlin.collections.HashMap

fun getDefaultParams(
    params: HashMap<String, Any>
): MutableMap<String, Any> {
    params["android"] = true
    return params
}

fun getDefaultParams(
    builder: MultipartBody.Builder
): MultipartBody.Builder {
    builder.setType(MultipartBody.FORM)
    var token = Preferences.getUserToken()
    builder.addFormDataPart("android", "true")
    return builder
}