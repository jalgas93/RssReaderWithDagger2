package com.example.rssreaderwithdagger2.di

import android.app.Application
import com.example.rssreaderwithdagger2.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,MainActivityModule::class,NetworkModule::class,RepositoryModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application):Builder
        fun build():AppComponent
    }
    fun inject(app: App)
}