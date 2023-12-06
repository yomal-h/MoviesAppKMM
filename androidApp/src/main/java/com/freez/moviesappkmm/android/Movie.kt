package com.freez.moviesappkmm.android

import android.app.Application
import com.freez.moviesappkmm.android.di.appModule
import com.freez.moviesappkmm.di.getSharedModules
import org.koin.core.context.GlobalContext.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}