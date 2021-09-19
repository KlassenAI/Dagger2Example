package com.android.dagger2example

import android.app.Application
import android.util.Log
import javax.inject.Inject

class Repository @Inject constructor(private val application: Application): IRepository {

    override fun test() {
        Log.e("TAG", "repository doing something...")
    }
}