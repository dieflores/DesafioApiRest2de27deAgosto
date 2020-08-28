package com.example.desafioapi2picasso_27agosto.elretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioapi2picasso_27agosto.R
import com.example.desafioapi2picasso_27agosto.el_pojo.ThePics

class PicsAdapterRetro(): RecyclerView.Adapter<PicsAdapterRetro.HolderPhoto>() {

    private lateinit var mData: List<ThePics>
    fun updateList(dataList: List<ThePics>){
        mData= dataList
        notifyDataSetChanged()
    }

    class HolderPhoto(itemView: View) : RecyclerView.ViewHolder(itemView){
        val photo0: ImageView = itemView.photoImageView
        val titlePhoto: TextView = itemView.titlePhotoTextView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPhoto {
        TODO("Not yet implemented")
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_photo, parent, false)
    }
}