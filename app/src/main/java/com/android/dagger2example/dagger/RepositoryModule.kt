package com.android.dagger2example.dagger

import com.android.dagger2example.IRepository
import com.android.dagger2example.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(repository: Repository): IRepository
}