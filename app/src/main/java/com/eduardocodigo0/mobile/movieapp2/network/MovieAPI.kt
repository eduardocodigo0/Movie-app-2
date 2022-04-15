package com.eduardocodigo0.mobile.movieapp2.network

import com.eduardocodigo0.mobile.movieapp2.network.data.Movies
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    @GET("movie/popular")
    suspend fun getMovies(
        @Query("api_key") api_key: String,
        @Query("page") page: Int): Movies

    @GET("search/movie")
    suspend fun getSearch(
        @Query("api_key") api_key: String,
        @Query("page") page: Int,
        @Query("query") query: String): Movies
}