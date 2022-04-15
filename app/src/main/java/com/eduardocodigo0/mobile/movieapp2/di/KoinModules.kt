package com.eduardocodigo0.mobile.movieapp2.di

import com.eduardocodigo0.mobile.movieapp2.network.provideMovieAPI
import com.eduardocodigo0.mobile.movieapp2.network.provideRetrofit
import org.koin.dsl.module
import retrofit2.Retrofit


val networkModules = module {
    single { provideRetrofit() }
    factory { provideMovieAPI(get()) }
}