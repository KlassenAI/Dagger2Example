package com.android.dagger2example.viewmodel

import androidx.lifecycle.ViewModel
import com.android.dagger2example.Repository
import javax.inject.Inject

open class MainViewModel : ViewModel() {

    @Inject
    lateinit var repository: Repository

    fun test() {
        repository.test()
    }
}
