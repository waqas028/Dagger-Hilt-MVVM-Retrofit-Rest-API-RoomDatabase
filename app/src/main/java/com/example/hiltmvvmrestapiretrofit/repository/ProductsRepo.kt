package com.example.hiltmvvmrestapiretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hiltmvvmrestapiretrofit.db.ProductDatabase
import com.example.hiltmvvmrestapiretrofit.model.Product
import com.example.hiltmvvmrestapiretrofit.retrofit.API
import javax.inject.Inject

class ProductsRepo @Inject constructor(private val api: API,private val productdb:ProductDatabase) {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products
    suspend fun getProducts(){
        val response=api.getProducts()
        if(response.isSuccessful && response.body() != null){
            productdb.getProductDao().addProducts(response.body()!!)
            _products.postValue(response.body())
        }
    }
}