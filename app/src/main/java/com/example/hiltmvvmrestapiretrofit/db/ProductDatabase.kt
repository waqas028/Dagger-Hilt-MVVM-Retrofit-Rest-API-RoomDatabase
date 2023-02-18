package com.example.hiltmvvmrestapiretrofit.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hiltmvvmrestapiretrofit.model.Product

@Database(entities = [Product::class], version = 1)
abstract class ProductDatabase:RoomDatabase() {

    abstract fun getProductDao():ProductDAO
}