package com.regawa.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_linearlayout.setOnClickListener{
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }
        btn_relativelayout.setOnClickListener{
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
        }
        btn_scrollview.setOnClickListener{
            val intent = Intent(this, ScrollActivity::class.java)
            startActivity(intent)
        }
        btn_listview.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
        btn_gridview.setOnClickListener{
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }

    }
}