package com.android.dagger2example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    companion object {
        private const val TAG = "DieselEngine"
    }

    override fun start() {
        Log.e(TAG, "starting... Horsepower: $horsePower")
    }
}