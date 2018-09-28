package freeand.cinemawy.ui.home

import android.content.Context
import android.databinding.BaseObservable
import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableList

import cz.msebera.android.httpclient.HttpException
import freeand.cinemawy.data.model.Movie
import freeand.cinemawy.data.repository.MoviesRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class MoviesViewModel( val mMoviesRepository: MoviesRepository) : BaseObservable() {

    // observable fields on the
    lateinit var movies : ObservableList<Movie>


    val emptyViewShowing = ObservableBoolean(false)


    fun start() {
        discoverMovies(movies.isEmpty())
    }

    fun discoverMovies(showLoading: Boolean) {
        // reset the states to initial states
        emptyViewShowing.set(false)

        mMoviesRepository.getPopularMovies(1)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(object : DisposableObserver<ArrayList<Movie>>() {
                    override fun onNext(value: ArrayList<Movie>?) {
                        // show or hide empty view
                        val isEmpty = value == null || value.isEmpty()

                        if (!isEmpty) {
                            movies.clear()
                            movies.addAll(value!!)
                        }
                        emptyViewShowing.set(isEmpty)
                    }

                    override fun onError(throwable: Throwable) {

                    }

                    override fun onComplete() {}
                })
    }


}

