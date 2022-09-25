package com.example.recyclerviewdemo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
         return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.myTextView.text = "Hello from onBindViewHolder $position"
    }

    override fun getItemCount(): Int {
        return 5
    }
}

class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){
  val myTextView = view.findViewById<TextView>(R.id.tvName)
}