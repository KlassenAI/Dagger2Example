package com.android.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    companion object {
        private const val TAG = "Remote"
    }

    fun setListener(car: Car) {
        Log.e(TAG, "Remote connected")
    }
}