package com.android.dagger2example.car

import android.util.Log

class Tires {

    companion object {
        private const val TAG = "Tires"
    }

    fun inflate() {
        Log.e(TAG, "Tires inflated")
    }
}
