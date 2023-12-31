package com.freez.moviesappkmm.data.remote

import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlin.collections.get

internal class MovieService: KtorApi() {

    suspend fun getMovies(page: Int = 1): MoviesResponse = client.get {
        pathUrl("movie/popular")
        parameter("page", page)
    }.also {
        println("getMovies response: $it")
    }.body()

    suspend fun getMovie(movieId: Int): MovieRemote = client.get {
        pathUrl("movie/${movieId}")
    }.also {
        println("getMovie response: $it")
    }.body()

}