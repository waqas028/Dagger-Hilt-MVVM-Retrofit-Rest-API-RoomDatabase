package com.example.hiltmvvmrestapiretrofit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hiltmvvmrestapiretrofit.R
import com.example.hiltmvvmrestapiretrofit.model.Product

class ProductsListAdapter(val context: Context):RecyclerView.Adapter<ProductsListAdapter.ProductListViewHolder>() {

    class ProductListViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        var pnametextview:TextView=itemview.findViewById(R.id.pnametextview)
        var ppricetextview:TextView=itemview.findViewById(R.id.ppricetextview)
        var productimageview:ImageView=itemview.findViewById(R.id.productimageview)
    }
    private val differCallback = object : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }
    }
    val differ = AsyncListDiffer(this, differCallback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductListViewHolder {
        return ProductListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.productcardview,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: ProductListViewHolder, position: Int) {
        val productlist=differ.currentList[position]
        holder.pnametextview.text=productlist.title
        holder.ppricetextview.text="$${productlist.price}"
        Glide.with(context).load(productlist.image).into(holder.productimageview)
    }
}