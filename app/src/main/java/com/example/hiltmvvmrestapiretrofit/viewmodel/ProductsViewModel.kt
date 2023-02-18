package com.example.hiltmvvmrestapiretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltmvvmrestapiretrofit.model.Product
import com.example.hiltmvvmrestapiretrofit.repository.ProductsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(private val productsRepo: ProductsRepo):ViewModel(){
    val productsLiveData : LiveData<List<Product>>
    get() = productsRepo.products

    init {
        viewModelScope.launch {
            //delay(10000)
            productsRepo.getProducts()
        }
    }
}