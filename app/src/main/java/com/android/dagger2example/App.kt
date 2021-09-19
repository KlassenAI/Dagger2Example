package com.android.dagger2example

import android.app.Application
import com.android.dagger2example.dagger.BaseComponent
import com.android.dagger2example.dagger.DaggerBaseComponent

class App: Application() {

    lateinit var component: BaseComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerBaseComponent.builder()
            .withApplication(this)
            .build()
    }
}