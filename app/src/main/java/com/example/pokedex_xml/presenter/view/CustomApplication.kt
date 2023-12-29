package com.example.pokedex_xml.presenter.view

import android.app.Application
import com.example.pokedex_xml.di.AppModule
import org.koin.core.context.startKoin

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(AppModule.module)
        }
    }
}