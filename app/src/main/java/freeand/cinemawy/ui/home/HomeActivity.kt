package freeand.cinemawy.ui.home

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import freeand.cinemawy.R
import freeand.cinemawy.databinding.ActivityHomeBinding
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager


class HomeActivity : AppCompatActivity() {

    lateinit var moviesViewModel : MoviesViewModel
    lateinit var mAdapter: MovieAdapter
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)
        binding.viewModel = moviesViewModel

        setupRecyclerView()

        moviesViewModel.discoverMovies(true)
    }

    private fun setupRecyclerView() {
        mAdapter = MovieAdapter()

        binding.moviesRecycler.setLayoutManager(LinearLayoutManager(this))
        binding.moviesRecycler.setAdapter(mAdapter)
    }

}
