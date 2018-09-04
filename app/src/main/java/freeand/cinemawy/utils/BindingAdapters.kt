package freeand.cinemawy.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso


/**
 * Created by oq-dev on 9/3/2018.
 */
class BindingAdapters {

    @BindingAdapter("bind:imageUrl")
    fun loadImage(imageView: ImageView, url: String) {
        Picasso.get()
                .load(url)
                .into(imageView)
    }
}