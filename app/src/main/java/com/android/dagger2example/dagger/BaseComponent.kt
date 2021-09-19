package com.android.dagger2example.dagger

import android.app.Application
import com.android.dagger2example.viewmodel.MainViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])
interface BaseComponent {

    fun inject(viewModel: MainViewModel)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun withApplication(application: Application): Builder

        fun build(): BaseComponent
    }
}