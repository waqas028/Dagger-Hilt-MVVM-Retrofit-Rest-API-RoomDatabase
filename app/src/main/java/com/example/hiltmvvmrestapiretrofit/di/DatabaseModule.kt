package com.example.hiltmvvmrestapiretrofit.di

import android.content.Context
import androidx.room.Room
import com.example.hiltmvvmrestapiretrofit.db.ProductDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(@ApplicationContext context: Context):ProductDatabase{
        return Room.databaseBuilder(context,ProductDatabase::class.java,"productDB").build()
    }
}