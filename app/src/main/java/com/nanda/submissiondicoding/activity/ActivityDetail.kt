package com.nanda.submissiondicoding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nanda.submissiondicoding.Club.Club
import com.nanda.submissiondicoding.R
import com.nanda.submissiondicoding.databinding.ActivityDetailBinding

class ActivityDetail : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataClub = intent.getParcelableExtra<Club>(CLUB_DATA) as Club
        Glide.with(this).load(dataClub.photo).into(binding.imgHome)
        binding.apply {
            clubName.text = dataClub.name
            descDetail.text = dataClub.detail

        }
    }

    companion object {
        const val CLUB_DATA = "0"
    }
}