package yello.data.remote.setup

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
    builder.addFormDataPart("android", "true")
    return builder
}