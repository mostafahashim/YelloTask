package yello.emitter.remote.setup

import yello.emitter.util.Preferences
import kotlin.collections.HashMap

inline fun getDefaultHeaders(isFormData: Boolean): MutableMap<String, String> {
    var params = HashMap<String, String>()
    if (!isFormData)
        params["Content-Type"] = "application/json"

    params["Accept"] = "application/json"
    params["Accept-Language"] = Preferences.getApplicationLocale()
    params["Authorization"] = if (!Preferences.getAPIToken()
            .isNullOrEmpty()
    ) "Bearer ${Preferences.getAPIToken()}" else ""
    return params
}
