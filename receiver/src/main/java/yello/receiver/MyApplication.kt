package yello.receiver

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.provider.Settings

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }

    fun getDeviceId(): String {
        return Settings.Secure.getString(
            contentResolver,
            Settings.Secure.ANDROID_ID
        )
    }

    fun getDeviceModel(): String {
        return (Build.MANUFACTURER
                + " " + Build.MODEL)
    }

    fun getOSVersion(): String {
        return (Build.VERSION_CODES::class.java.fields[android.os.Build.VERSION.SDK_INT].name)
    }

    fun getDeviceModelNameAndOS(): String {
        return (Build.MANUFACTURER
                + " " + Build.MODEL + " " + Build.VERSION.RELEASE
                + " " + Build.VERSION_CODES::class.java.fields[android.os.Build.VERSION.SDK_INT].name)
    }
}