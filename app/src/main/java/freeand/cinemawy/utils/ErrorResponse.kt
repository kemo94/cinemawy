package freeand.cinemawy.utils

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by BEST BUY on 5/7/2018.
 */
class ErrorResponse {
    @SerializedName("errors_str")
    @Expose
    private var msg = ""

    @SerializedName("message")
    @Expose
    private val message = ""

    fun getMessage(): String {
        return message
    }

    fun getMsg(): String {
        return msg
    }

    fun setMsg(msg: String) {
        this.msg = msg
    }
}