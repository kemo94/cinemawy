package freeand.cinemawy.data.model

import android.os.Parcel
import android.os.Parcelable


class Movie(
        val poster_path: String,
        val overview: String,
        val release_date: String,
        val id: Long = 0,
        val title: String,
        val backdropPath: String,
        val popularity: Double,
        val vote_count: Long,
        val vote_average: Double,
        val homepage: String,
        val runtime: Long = 0,
        val budget: Long = 0,
        val tagline: String,
        val status: String

) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readLong(),
            parcel.readString(),
            parcel.readString(),
            parcel.readDouble(),
            parcel.readLong(),
            parcel.readDouble(),
            parcel.readString(),
            parcel.readLong(),
            parcel.readLong(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(poster_path)
        parcel.writeString(overview)
        parcel.writeString(release_date)
        parcel.writeLong(id)
        parcel.writeString(title)
        parcel.writeString(backdropPath)
        parcel.writeDouble(popularity)
        parcel.writeLong(vote_count)
        parcel.writeDouble(vote_average)
        parcel.writeString(homepage)
        parcel.writeLong(runtime)
        parcel.writeLong(budget)
        parcel.writeString(tagline)
        parcel.writeString(status)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
