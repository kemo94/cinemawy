package freeand.cinemawy.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso
import android.support.v7.widget.RecyclerView
import freeand.cinemawy.data.model.Movie

class BindingAdapters {
    companion object {
        @BindingAdapter("bind:imageUrl")
        @JvmStatic
        fun loadImage(imageView: ImageView, url: String) {
            Picasso.get()
                    .load(url)
                    .into(imageView)
        }

        @BindingAdapter("bind:movies")
        fun loadMovies(recyclerView: RecyclerView, movies: ArrayList<Movie>) {
            val adapter = recyclerView.adapter


        }
    }
}