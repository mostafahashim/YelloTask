package yello.data.remote

import yello.data.model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class JsonParser {

    fun getUserModelsResponseModel(response: String?): ArrayList<UserModel>? {
        return try {
            val gson = Gson()
            val type = object : TypeToken<ArrayList<UserModel>>() {

            }.type
            gson.fromJson(response, type)
        } catch (e1: Exception) {
            e1.printStackTrace()
            null
        }
    }
}


