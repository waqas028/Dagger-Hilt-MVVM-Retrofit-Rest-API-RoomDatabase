package com.example.hiltmvvmrestapiretrofit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hiltmvvmrestapiretrofit.R
import com.example.hiltmvvmrestapiretrofit.adapter.ProductsListAdapter
import com.example.hiltmvvmrestapiretrofit.viewmodel.ProductsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: ProductsViewModel
    lateinit var productadapter:ProductsListAdapter
    lateinit var productrecycleview:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup RecycleView
        productrecycleview=findViewById(R.id.productsrecycleview)
        productrecycleview.layoutManager=GridLayoutManager(this,2)
        productadapter= ProductsListAdapter(this)
        productrecycleview.adapter=productadapter

        mainViewModel = ViewModelProvider(this).get(ProductsViewModel::class.java)

        mainViewModel.productsLiveData.observe(this, Observer {
            productadapter.differ.submitList(it)
        })
    }
}