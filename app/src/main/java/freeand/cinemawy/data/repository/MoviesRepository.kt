package freeand.cinemawy.data.repository

import freeand.cinemawy.data.model.Movie
import io.reactivex.Observable

/**
 * Created by oq-dev on 9/4/2018.
 */

interface MoviesRepository {

    /*
    * Get list of popular movies
    */
    fun getPopularMovies(page: Int): Observable<List<Movie>>

    /**
     * Get movie details given a movie id
     */
    fun getMovieDetails(movieId: Long): Observable<Movie>


}
