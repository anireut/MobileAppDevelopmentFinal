package com.example.assignment5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
class MyAdapter(


    private val contactlist : ArrayList<Contacts>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem = contactlist[position]
        //holder.title.setImageResource(currentItem.title)
        holder.header.text = currentItem.header
        //holder.description.text = currentItem.description
        holder.itemView.setOnClickListener(View.OnClickListener {
            val intent = Intent(it.context, ContactDetailsActivity::class.java).apply {
                putExtra("heading", holder.header.text)
                //putExtra("description", holder.itemId)
                // putExtra("image", holder.description.text)
            }
            it.context.startActivity(intent)
        })

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //val title : ShapeableImageView = itemView.findViewById(R.id.title)
        val header : TextView = itemView.findViewById(R.id.header)
        //val description : TextView = itemView.findViewById(R.id.description)

    }

}
