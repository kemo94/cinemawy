package freeand.cinemawy.ui.movie

import android.databinding.BaseObservable
import android.databinding.Observable
import android.databinding.ObservableField
import android.databinding.ObservableFloat
import android.databinding.ObservableLong

import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.data.repository.MoviesRepository
import android.databinding.ObservableBoolean




/**
 * Base ViewModel for the movie.
 */

open class MovieViewModel( movie: Movie) : BaseObservable() {

    private val mObservableMovie = ObservableField<Movie>()

    val posterUrl = ObservableField<String>()
    val movieTitle = ObservableField<String>()
    val backdropUrl = ObservableField<String>()
    val voteAverage = ObservableFloat()
    val voteCount = ObservableLong()
    val movieOverview = ObservableField<String>()
    val movieTagline = ObservableField<String>()
    val movieReleaseDate = ObservableField<String>()


    val isMovieLoading = ObservableBoolean()
    val errorViewShowing = ObservableBoolean()
    val errorString = ObservableField<String>()

    var movie: Movie?


    get() = mObservableMovie.get()
    set(movie) = mObservableMovie.set(movie)

    init {
        mObservableMovie.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(observable: Observable, i: Int) {
                val movie = mObservableMovie.get()

                if (movie != null) {
                    posterUrl.set(getPosterUrl(movie))
                    movieTitle.set(getTitle(movie))
                    backdropUrl.set(getBackdropUrl(movie))
                    voteAverage.set(movie.vote_average.toFloat())
                    voteCount.set(movie.vote_count)
                    movieOverview.set(movie.overview)
                    movieTagline.set(movie.tagline)
                    movieReleaseDate.set(getReleaseDate(movie))
                }
            }
        })
        mObservableMovie.set(movie)

    }


    private fun getTitle(movie: Movie): String? {
        return movie.title
    }

    /**
     * Constructs the poster url
     * @return the poster url
     */
    private fun getPosterUrl(movie: Movie): String {
        //"https://image.tmdb.org/t/p/w342" +
        return movie.poster_path!!
    }

    private fun getBackdropUrl(movie: Movie): String {
        return if ( movie.backdropPath!!.length == 0 ) ""
        else
            "https://image.tmdb.org/t/p/w780" + movie.backdropPath!!
    }

    private fun getReleaseDate(movie: Movie?): String? {
        return movie!!.release_date
    }

}