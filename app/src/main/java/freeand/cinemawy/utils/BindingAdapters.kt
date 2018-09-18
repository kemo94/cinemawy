package freeand.cinemawy.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso
import freeand.cinemawy.ui.home.MovieAdapter
import android.support.v7.widget.RecyclerView
import freeand.cinemawy.data.model.Movie

class BindingAdapters {

    @BindingAdapter("bind:imageUrl")
    fun loadImage(imageView: ImageView, url: String) {
        Picasso.get()
                .load(url)
                .into(imageView)
    }

    @BindingAdapter("bind:movies")
    fun loadMovies(recyclerView: RecyclerView, movies: ArrayList<Movie>) {
        val adapter = recyclerView.adapter

        if (adapter != null && adapter is MovieAdapter) {
            adapter.setMovies(movies)
        } else {
            throw IllegalStateException("RecyclerView either has no adapter set or the " + "adapter isn't of type MovieAdapter")
        }
    }
}