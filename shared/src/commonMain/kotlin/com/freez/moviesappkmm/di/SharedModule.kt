package com.freez.moviesappkmm.di

import com.freez.moviesappkmm.data.remote.MovieService
import com.freez.moviesappkmm.data.remote.RemoteDataSource
import com.freez.moviesappkmm.data.repository.MovieRepositoryImpl
import com.freez.moviesappkmm.domain.repository.MovieRepository
import com.freez.moviesappkmm.domain.usecase.GetMovieUseCase
import com.freez.moviesappkmm.domain.usecase.GetMoviesUseCase
import com.freez.moviesappkmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules