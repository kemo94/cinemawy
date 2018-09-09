package freeand.cinemawy.utils

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.Toast
import freeand.cinemawy.R


/**
 * <h1>Implement reusable dialogs</h1>
 * Dialogs class for all dialogs and toasts
 *
 *
 *
 * @author kemo94
 * @version 1.0
 * @since 2017-08-9
 */

object Dialogs {

    lateinit var progressDialog: Dialog

    var noInternetDialog: Dialog? = null


    fun showToast(message: String, activity: Activity) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }

    fun showToast(message: String, context: Context) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun showLoading(activity: Activity) {
        dismissLoading()
        try {
            progressDialog = Dialog(activity)
            progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            progressDialog.setContentView(R.layout.loading_dialog)
            progressDialog.setCancelable(false)
            progressDialog.show()
        } catch (e: Exception) {

        }

    }


    fun showLoading(activity: Context) {
        dismissLoading()
        try {
            progressDialog = Dialog(activity)
            progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            progressDialog.setContentView(R.layout.loading_dialog)
            progressDialog.setCancelable(false)
            progressDialog.show()
        } catch (e: Exception) {

        }

    }


    fun dismissLoading() {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss()
            }
        } catch (e: Exception) {
        }
    }
}