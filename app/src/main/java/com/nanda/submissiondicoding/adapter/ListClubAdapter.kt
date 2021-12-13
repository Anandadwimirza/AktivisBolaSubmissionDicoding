package com.nanda.submissiondicoding.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nanda.submissiondicoding.Club.Club
import com.nanda.submissiondicoding.R
import com.nanda.submissiondicoding.activity.ActivityDetail

class ListClubAdapter(private val listClub: ArrayList<Club>) : RecyclerView.Adapter<ListClubAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {


        val view : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_clubs, viewGroup, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val club = listClub[position]

        Glide.with(holder.itemView.context)
            .load(club.photo)
            .into(holder.imgPhoto)
        holder.tvName.text = club.name
        holder.tvDetail.text = club.detail
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, ActivityDetail::class.java)
            intent.putExtra(ActivityDetail.CLUB_DATA, listClub[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listClub.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)


    }
}