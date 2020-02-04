package com.example.final012

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_item_home.view.*

class MyAdapter(var datalist : List<DataModel>,var context : Context)
    : RecyclerView.Adapter<ViewHolder>()

{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_home,parent,false))
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        try{
            holder?.textview.text = datalist.get(position).title
            Glide.with(context).load(datalist.get(position).url).into(holder?.imageView)
        }catch (errorVar:Exception){

            Log.e("Error",errorVar.message)
        }
        holder?.textview.text = datalist.get(position).title.toString()


    }
}
class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
    var imageView = view.img_photo
    var textview = view.tv_title
}