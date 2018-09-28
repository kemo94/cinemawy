package freeand.cinemawy.ui.movie

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import freeand.cinemawy.R
import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

    lateinit var movieViewModel : MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val movie =  intent.getParcelableExtra<Movie>("movie")
        movieViewModel = MovieViewModel(movie)

        val binding = DataBindingUtil.setContentView<ActivityMovieBinding>(this, R.layout.activity_movie)
        binding.viewModel = movieViewModel

    }
}
