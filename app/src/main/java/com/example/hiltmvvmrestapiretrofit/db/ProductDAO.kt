package com.example.hiltmvvmrestapiretrofit.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hiltmvvmrestapiretrofit.model.Product

@Dao
interface  ProductDAO {

    @Query("SELECT * FROM Product")
    suspend fun getProducts():List<Product>

    @Insert(onConflict =OnConflictStrategy.REPLACE)
    suspend fun addProducts(products:List<Product>)
}