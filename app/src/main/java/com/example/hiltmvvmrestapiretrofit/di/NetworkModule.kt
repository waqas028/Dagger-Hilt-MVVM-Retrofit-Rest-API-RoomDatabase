package com.example.hiltmvvmrestapiretrofit.di

import com.example.hiltmvvmrestapiretrofit.retrofit.API
import com.example.hiltmvvmrestapiretrofit.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory
                .create()).build()
    }

    @Singleton
    @Provides
    fun providesAPI(retrofit: Retrofit):API{
        return retrofit.create(API::class.java)
    }
}