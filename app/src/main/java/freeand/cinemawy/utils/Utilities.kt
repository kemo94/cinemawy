package freeand.cinemawy.utils

import android.content.Context
import android.provider.Settings
import java.text.SimpleDateFormat
import java.util.*


object Utilities {

    fun getDeviceId(context: Context): String {
        return Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID)
    }

    fun formatMessageDateTime(date: String): String {
        var simpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH)
        var date1 = simpleDateFormat.parse(date)
        simpleDateFormat = SimpleDateFormat("EEEE dd MMMM yyyy")
        return simpleDateFormat.format(date1)
    }

    fun pad(time: Int): String {

        return if (time < 10) "0$time" else "" + time

    }

}