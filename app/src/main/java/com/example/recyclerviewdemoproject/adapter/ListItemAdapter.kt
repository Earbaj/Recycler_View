package com.example.recyclerviewdemoproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemoproject.R
import com.example.recyclerviewdemoproject.model.Dog

class ListItemAdapter(private val context: Context, private val dataset: List<Dog>):
    RecyclerView.Adapter<ListItemAdapter.ItemHolder>(){

    class ItemHolder(private val view: View): RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.list_item_txt)
        val agetextView: TextView = view.findViewById(R.id.list_item_age_txt)
        val imageView: ImageView = view.findViewById(R.id.img_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val adapterLayoutView = LayoutInflater.from(parent.context).
        inflate(R.layout.list_item_desigh,parent,false)
        return ItemHolder(adapterLayoutView)

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val dataItem = dataset[position]
        holder.textView.text = "Name: " + dataItem.name
        holder.agetextView.text = "Age: " + dataItem.age
        holder.imageView.setImageResource(dataItem.imageResourceId)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}