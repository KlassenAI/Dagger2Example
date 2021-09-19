package com.android.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val driver: Driver,
    private val engine: Engine,
    private val wheels: Wheels
) {


    companion object {
        internal val test = "asd"
        private const val TAG = "Car"
    }

    fun drive() {
        Log.e(TAG, this.toString())
        engine.start()
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    override fun toString(): String {
        return "Car(driver=$driver, engine=$engine, wheels=$wheels)"
    }
}