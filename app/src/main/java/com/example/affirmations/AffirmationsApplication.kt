package com.example.affirmations

import android.app.Application
import com.google.android.material.color.DynamicColors

class AffirmationsApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}