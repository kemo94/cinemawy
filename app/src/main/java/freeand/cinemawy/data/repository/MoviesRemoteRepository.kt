package freeand.cinemawy.data.repository

import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.data.remote.api.ApiUtils
import freeand.cinemawy.data.remote.api.MovieApiService
import freeand.cinemawy.data.remote.responses.DiscoverMoviesResponse
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function


class MoviesRemoteRepository(private val apiService: MovieApiService) : MoviesRepository {

    override fun getPopularMovies(page: Int): Observable<ArrayList<Movie>> {
        val discoverMoviesResponseObservable = apiService.discover("popularity.desc", page, ApiUtils.apiKey)
        return discoverMoviesResponseObservable
                .flatMap<ArrayList<Movie>>({ discoverMoviesResponse -> Observable.just(discoverMoviesResponse.results!!) })
    }

    override fun getMovieDetails(movieId: Long): Observable<Movie> {
        return apiService.getMovieDetails(movieId, ApiUtils.apiKey)
    }
}
