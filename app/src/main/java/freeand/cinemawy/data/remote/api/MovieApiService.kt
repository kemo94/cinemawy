package freeand.cinemawy.data.remote.api


import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.data.remote.responses.DiscoverMoviesResponse
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query



interface MovieApiService {

    /**
     * Discover movie
     */
    @GET("discover/movie")
    fun discover(@Query("sort_by") sortBy: String,
                 @Query("page") page: Int,
                 @Query("api_key") apiKey: String): Observable<DiscoverMoviesResponse>

    /**
     * Get movie details
     *
     * @param movieId - movie id
     * @param apiKey - API key
     */
    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") movieId: Long,
                        @Query("api_key") apiKey: String): Observable<Movie>


    object Creator {

        fun create(): MovieApiService {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(
                            RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(ApiUtils.baseUrl)
                    .build()
            return retrofit.create(MovieApiService::class.java)
        }
    }
}
