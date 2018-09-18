package freeand.cinemawy.ui.home

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import java.util.ArrayList

import freeand.cinemawy.R
import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.databinding.MovieItem

class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    private var movies: List<Movie>? = null

    init {
        movies = ArrayList()
    }

    fun setMovies(movies: List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val movieItem = DataBindingUtil.inflate<MovieItem>(LayoutInflater.from(parent.context),
                R.layout.item_movie_layout, parent, false)
        return MovieViewHolder(movieItem)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies!![position]

        val movieItemViewModel = MovieItemViewModel()
        movieItemViewModel.movie = movie
        holder.setMovieItemViewModel(movieItemViewModel)
    }

    override fun getItemCount(): Int {
        return movies!!.size
    }
}
