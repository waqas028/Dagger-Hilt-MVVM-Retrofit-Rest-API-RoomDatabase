package com.example.hiltmvvmrestapiretrofit.retrofit

import com.example.hiltmvvmrestapiretrofit.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface API {

    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}