package com.regawa.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val listMakanan = arrayOf("Klepon","Nasi Goreng","Rendang","Indomie")

        lv_makanan.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, listMakanan)

        lv_makanan.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Saya mau ${listMakanan[i]} !", Toast.LENGTH_SHORT).show()
        }



    }
}