package freeand.cinemawy.data.repository

import freeand.cinemawy.data.model.Movie
import io.reactivex.Observable

interface MoviesRepository {

    /*
    * Get list of popular movies
    */
    fun getPopularMovies(page: Int): Observable<ArrayList<Movie>>

    /**
     * Get movie details given a movie id
     */
    fun getMovieDetails(movieId: Long): Observable<Movie>


}
