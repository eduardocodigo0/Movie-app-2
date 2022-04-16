package com.eduardocodigo0.mobile.movieapp2.di

import com.eduardocodigo0.mobile.movieapp2.network.provideMovieAPI
import com.eduardocodigo0.mobile.movieapp2.network.provideRetrofit
import com.eduardocodigo0.mobile.movieapp2.ui.viewmodels.BestMoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module



val networkModules = module {
    single { provideRetrofit() }
    factory { provideMovieAPI( get() ) }
}

val viewModelModules = module {
    viewModel { BestMoviesViewModel(get()) }
}