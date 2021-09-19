package com.android.dagger2example.car

import android.util.Log
import com.android.dagger2example.dagger.DaggerNames.Companion.CAPACITY
import com.android.dagger2example.dagger.DaggerNames.Companion.HORSE_POWER
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor() : Engine {

    companion object {
        private const val TAG = "PetrolEngine"
    }

    override fun start() {
        Log.e(TAG, this.toString())
    }

    override fun toString(): String {
        return "PetrolEngine"
    }
}
