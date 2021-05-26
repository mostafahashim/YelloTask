package yello.data.remote.setup

import kotlin.collections.HashMap

inline fun getDefaultHeaders(isFormData: Boolean): MutableMap<String, String> {
    var params = HashMap<String, String>()
    if (!isFormData)
        params["Content-Type"] = "application/json"

    params["Accept"] = "application/json"
    return params
}
