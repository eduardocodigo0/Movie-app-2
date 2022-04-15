package com.eduardocodigo0.mobile.movieapp2.network

import com.eduardocodigo0.mobile.movieapp2.utils.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun provideRetrofit(): Retrofit{
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun provideMovieAPI(retrofit: Retrofit): MovieAPI{
    return retrofit.create(MovieAPI::class.java)
}