package com.example.assignment5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
class MyAdapter(


    private val contactlist : ArrayList<Contacts>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    private lateinit var clickslistener : onItemClickListener
    interface  onItemClickListener{
            fun onItemClick(position: Int)

    }
    fun setOnItermClickListener(listener: onItemClickListener){
        clickslistener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView, clickslistener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem = contactlist[position]
        //holder.title.setImageResource(currentItem.title)
        holder.header.text = currentItem.header
    //holder.description.text = currentItem.description

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }


    inner class MyViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){
        //val title : ShapeableImageView = itemView.findViewById(R.id.title)
        val header : TextView = itemView.findViewById(R.id.header)
        val description : TextView = itemView.findViewById(R.id.description)


        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

}
