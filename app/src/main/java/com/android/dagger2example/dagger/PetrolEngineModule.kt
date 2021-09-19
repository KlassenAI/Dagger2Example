package com.android.dagger2example.dagger

import com.android.dagger2example.car.Engine
import com.android.dagger2example.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}