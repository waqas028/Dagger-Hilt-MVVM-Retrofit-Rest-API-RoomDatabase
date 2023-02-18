package com.example.hiltmvvmrestapiretrofit.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product(
    @PrimaryKey(autoGenerate = false)
    val id: Int,

    val category: String,
    val description: String,
    val image: String,
    val price: Double,
    val title: String
)