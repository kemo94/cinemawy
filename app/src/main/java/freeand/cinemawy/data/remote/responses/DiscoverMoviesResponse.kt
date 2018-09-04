package freeand.cinemawy.data.remote.responses

import com.google.gson.annotations.SerializedName

import freeand.cinemawy.data.model.Movie

/**
 * Created by oq-dev on 9/3/2018.
 */

class DiscoverMoviesResponse {

    @SerializedName("page")
    val page: Long = 0

    @SerializedName("results")
    var results: List<Movie>? = null

    @SerializedName("total_pages")
    val totalPages: Long = 0

    @SerializedName("total_results")
    val totalResults: Long = 0
}
