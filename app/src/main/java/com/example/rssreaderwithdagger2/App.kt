package com.example.rssreaderwithdagger2

import android.app.Activity
import android.app.Application
import com.example.rssreaderwithdagger2.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector

import javax.inject.Inject

class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
            AppInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any>  = dispatchingAndroidInjector

}