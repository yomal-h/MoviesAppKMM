package com.freez.moviesappkmm.util

import com.freez.moviesappkmm.di.getSharedModules
import org.koin.core.context.startKoin


fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}