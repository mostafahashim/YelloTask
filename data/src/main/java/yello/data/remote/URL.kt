package yello.data.remote

object URL {

    fun getUsersUrl(): String {
        var url = "users"
        url = url.replace(" ".toRegex(), "%20")
        return url
    }

}