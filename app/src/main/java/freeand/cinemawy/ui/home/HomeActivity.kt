package freeand.cinemawy.ui.home

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import freeand.cinemawy.R
import freeand.cinemawy.databinding.ActivityHomeBinding
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.ui.movie.MovieActivity


class HomeActivity : AppCompatActivity() {

    lateinit var moviesViewModel: MoviesViewModel

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)


        val intent = Intent(this, MovieActivity::class.java)
        val movie = Movie("http://www.wordinfo.info/words/images/flout-1.jpg",
                 "overview",
         "2018",
         0,
         "title",
         "backdropPath",
         22.9,
         2,
         2.9,
         "sdsa",
         1,
         1,
         "tag",
         "status")
        intent.putExtra("movie",movie)
        startActivity(intent)

      //  setupRecyclerView()
//  moviesViewModel.discoverMovies(true)
    }

    private fun setupRecyclerView() {
//        mAdapter = MovieAdapter()
//
//        binding.moviesRecycler.setLayoutManager(LinearLayoutManager(this))
//        binding.moviesRecycler.setAdapter(mAdapter)
    }

}
