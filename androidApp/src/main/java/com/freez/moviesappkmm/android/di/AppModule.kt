package com.freez.moviesappkmm.android.di

import com.freez.moviesappkmm.android.detail.DetailViewModel
import com.freez.moviesappkmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}