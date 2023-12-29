package com.example.core_network.di

import com.squareup.moshi.Moshi
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkModule {
    val module = module {

        single {
            providerRetrofit(
                baseUrl = get(),
                okHttpClient = get(),
                moshi = get()
            )
        }
    }

    private fun providerRetrofit(
        baseUrl : String,
        okHttpClient : OkHttpClient,
        moshi: Moshi
    ): Retrofit {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }
}