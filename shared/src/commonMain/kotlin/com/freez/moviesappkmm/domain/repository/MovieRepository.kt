package com.freez.moviesappkmm.domain.repository

import com.freez.moviesappkmm.domain.model.Movie

interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}