package com.freez.moviesappkmm.data.remote

@kotlinx.serialization.Serializable
data class MoviesResponse(
    val results: List<MovieRemote>
)
