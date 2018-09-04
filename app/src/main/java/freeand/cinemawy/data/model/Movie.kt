package freeand.cinemawy.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by oq-dev on 9/3/2018.
 */


class Movie {

    @SerializedName("poster_path")
    val posterPath: String? = null

    @SerializedName("adult")
    val isAdult: Boolean = false

    @SerializedName("overview")
    val overview: String? = null

    @SerializedName("release_date")
    val releaseDate: String? = null

    @SerializedName("id")
    val id: Long = 0

    @SerializedName("title")
    val title: String? = null

    @SerializedName("backdrop_path")
    val backdropPath: String? = null

    @SerializedName("popularity")
    val popularity: Double = 0.toDouble()

    @SerializedName("vote_count")
    val voteCount: Long = 0

    @SerializedName("video")
    val isVideo: Boolean = false

    @SerializedName("vote_average")
    val voteAverage: Double = 0.toDouble()

    @SerializedName("imdb_id")
    val imdbId: String? = null

    @SerializedName("homepage")
    val homepageUrl: String? = null

    @SerializedName("runtime")
    val runtime: Long = 0

    @SerializedName("budget")
    val budget: Long = 0


    @SerializedName("tagline")
    val tagline: String? = null

    @SerializedName("status")
    val status: String? = null


}