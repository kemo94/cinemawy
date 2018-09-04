package freeand.cinemawy.ui.splash

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import freeand.cinemawy.R
import freeand.cinemawy.ui.base.BaseActivity
import freeand.cinemawy.ui.home.HomeActivity
import android.databinding.DataBindingUtil
import freeand.cinemawy.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivitySplashBinding>(this, R.layout.activity_splash)

        val animationimage = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        binding.splashImg.startAnimation(animationimage)

        animationimage.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {

            }

            override fun onAnimationEnd(animation: Animation) {

                goToActivity(HomeActivity::class.java, null)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation) {

            }
        })
    }
}
