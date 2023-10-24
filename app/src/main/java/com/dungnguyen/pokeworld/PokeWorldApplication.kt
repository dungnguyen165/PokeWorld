package com.dungnguyen.pokeworld

import android.app.Application
import com.dungnguyen.logging.PLog
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PokeWorldApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }

    private fun initLogger() {
        PLog.init()
    }
}