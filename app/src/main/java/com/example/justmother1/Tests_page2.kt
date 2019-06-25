package com.example.justmother1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tests_page2.*

class Tests_page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests_page2)
        prev_tpg_btn.setOnClickListener {
            val intent = Intent(this,Tests_page::class.java)
            startActivity(intent)
        }
        next_tpg_btn2.setOnClickListener {
            val intent = Intent(this,Tests_page3::class.java)
            startActivity(intent)
        }
    }
}
