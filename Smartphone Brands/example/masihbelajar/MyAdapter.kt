package com.example.masihbelajar

import android.graphics.drawable.shapes.Shape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val brandList : ArrayList<Detailbrand>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_brand, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {

        return brandList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = brandList[position]
        holder.brandImage.setImageResource(currentItem.brandImage)
        holder.tvHeading.text = currentItem.heading
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val brandImage : ShapeableImageView = itemView.findViewById(R.id.brand_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvHeading)
    }

}