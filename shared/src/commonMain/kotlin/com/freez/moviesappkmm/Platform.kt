package com.freez.moviesappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform