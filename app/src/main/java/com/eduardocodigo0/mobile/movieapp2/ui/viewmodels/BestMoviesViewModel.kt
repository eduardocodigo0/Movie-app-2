package com.eduardocodigo0.mobile.movieapp2.ui.viewmodels


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eduardocodigo0.mobile.movieapp2.network.MovieAPI
import com.eduardocodigo0.mobile.movieapp2.network.data.Movies
import com.eduardocodigo0.mobile.movieapp2.utils.StateView

class BestMoviesViewModel(movieAPI: MovieAPI):ViewModel() {

    private val _stateView: MutableLiveData<StateView<Movies>> = MutableLiveData()
    val stateView:LiveData<StateView<Movies>> get() = _stateView





}