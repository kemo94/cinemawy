package freeand.cinemawy.ui.home

import android.support.v7.widget.RecyclerView

import freeand.cinemawy.databinding.MovieItem

class MovieViewHolder(private val movieItem: MovieItem) : RecyclerView.ViewHolder(movieItem.root) {

    fun setMovieItemViewModel(movieItemViewModel: MovieItemViewModel) {
        movieItem.movieItemViewModel = movieItemViewModel
        movieItem.executePendingBindings()
    }
}

