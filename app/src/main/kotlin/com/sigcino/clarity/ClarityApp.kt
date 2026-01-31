package com.sigcino.clarity

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ClarityApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize app components
    }
}