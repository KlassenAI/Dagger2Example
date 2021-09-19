package com.android.dagger2example.dagger

import com.android.dagger2example.car.DieselEngine
import com.android.dagger2example.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private var horsePower: Int) {

    @Provides
    fun provideEngine(): Engine = DieselEngine(horsePower)
}