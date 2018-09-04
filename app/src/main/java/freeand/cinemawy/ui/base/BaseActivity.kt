package freeand.cinemawy.ui.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.app.Activity
import android.support.annotation.LayoutRes


open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

     override  fun setContentView(@LayoutRes layoutResID: Int) {
         super.setContentView(layoutResID)
    }

    fun goToActivity(targetClass: Class<*>, value: Bundle ?= null ) {

        val intent = Intent(this, targetClass)
        intent.putExtra("data", value)
        startActivity(intent)
    }


}
