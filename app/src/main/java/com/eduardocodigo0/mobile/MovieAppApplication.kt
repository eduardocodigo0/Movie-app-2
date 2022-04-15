package com.eduardocodigo0.mobile

import android.app.Application
import com.eduardocodigo0.mobile.movieapp2.di.networkModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieAppApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieAppApplication)
            modules(listOf(networkModules))
        }
    }
}