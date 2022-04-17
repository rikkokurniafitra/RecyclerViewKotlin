package com.rikko.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rikko.recyclerviewkotlin.R
import com.rikko.recyclerviewkotlin.Klubterkaya

class KlubterkayaAdapter (private val context: Context, private val klubterkaya: List<Klubterkaya>, val listener: (Klubterkaya) -> Unit)
    : RecyclerView.Adapter<KlubterkayaAdapter.KlubterkayaViewHolder>(){

    class KlubterkayaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgKlubterkaya = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKlubterkaya = view.findViewById<TextView>(R.id.tv_item_name)
        val descKlubterkaya = view.findViewById<TextView>(R.id.tv_item_description)



        fun bindView(klubterkaya: Klubterkaya, listener: (Klubterkaya) -> Unit){
            imgKlubterkaya.setImageResource(klubterkaya.imgKlubterkaya)
            nameKlubterkaya.text = klubterkaya.nameKlubterkaya
            descKlubterkaya.text = klubterkaya.descKlubterkaya
            itemView.setOnClickListener {
                listener(klubterkaya)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):KlubterkayaViewHolder {
        return KlubterkayaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_klubterkaya, parent, false))
    }

    override fun onBindViewHolder(holder: KlubterkayaViewHolder, position: Int) {
        holder.bindView(klubterkaya[position], listener)
    }

    override fun getItemCount(): Int = klubterkaya.size
}