package com.regawa.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_grid.*
import kotlinx.android.synthetic.main.activity_list.*

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        //array makanan
        val listMakanan = arrayOf("Klepon","Nasi Goreng","Rendang","Indomie")

        //adapter
        gd_makanan.adapter = ArrayAdapter(this,android.R.layout.simple_gallery_item, listMakanan)

        gd_makanan.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Saya mau ${listMakanan[i]} !", Toast.LENGTH_SHORT).show()
        }

    }
}