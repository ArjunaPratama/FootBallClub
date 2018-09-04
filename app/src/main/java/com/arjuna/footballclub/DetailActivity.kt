package com.arjuna.footballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.arjuna.footballclub.R.id.club_detail
import com.arjuna.footballclub.R.id.image
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*



class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val dataItem = intent.getParcelableExtra<Item>("data_item")
        Glide.with(this).load(dataItem.image).into(club_detail_image)

        club_detail.text = dataItem.name
        club_detail_spek.text = dataItem.keterangan





    }
}
