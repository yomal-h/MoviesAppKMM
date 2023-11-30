package com.freez.moviesappkmm.data.repository

import com.freez.moviesappkmm.data.remote.RemoteDataSource
import com.freez.moviesappkmm.domain.model.Movie
import com.freez.moviesappkmm.domain.repository.MovieRepository
import com.freez.moviesappkmm.util.toMovie

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}