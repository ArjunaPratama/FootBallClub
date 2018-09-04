package com.arjuna.footballclub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()
    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val keterangan = resources.getStringArray(R.array.club_spek)
        items.clear()
        for (i in name.indices){
            items.add(Item(name[i],
                    image.getResourceId(i, 0), keterangan[i]))
        }

        //Recycle the typed array
        image.recycle()

    }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val list = findViewById<RecyclerView>(R.id.list_club)
            initData()

            list.layoutManager = LinearLayoutManager(this)
            list.adapter = RecyclerViewAdapter(this, items, {
                item: Item-> startActivity<DetailActivity>("data_item" to item)
            })

        }

    }
