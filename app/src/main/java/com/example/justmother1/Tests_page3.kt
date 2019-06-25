package com.example.justmother1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tests_page3.*

class Tests_page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests_page3)
        prev_tpg_btn3.setOnClickListener {
            val intent = Intent(this, Tests_page2::class.java)
            startActivity(intent)
        }
    }
}
