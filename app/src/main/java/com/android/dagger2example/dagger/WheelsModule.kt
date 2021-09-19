package com.android.dagger2example.dagger

import com.android.dagger2example.car.Rims
import com.android.dagger2example.car.Tires
import com.android.dagger2example.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels = Wheels(rims, tires)
}
