package yello.emitter

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.provider.Settings
import androidx.multidex.MultiDex
import yello.emitter.util.LocaleHelper
import yello.emitter.util.Preferences
import java.util.*

class MyApplication : Application() {

    lateinit var context:Context
    override fun onCreate() {
        super.onCreate()
        Preferences.initializePreferences(this)
        context = LocaleHelper.updateLocale(this)
    }

    override fun attachBaseContext(base: Context) {
        context = LocaleHelper.updateLocale(base)
        super.attachBaseContext(context)
        MultiDex.install(base)
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