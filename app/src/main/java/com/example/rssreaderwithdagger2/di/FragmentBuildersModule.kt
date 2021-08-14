package com.example.rssreaderwithdagger2.di

import android.annotation.SuppressLint
import com.example.rssreaderwithdagger2.presentations.frontFragment.FrontFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment():FrontFragment
}