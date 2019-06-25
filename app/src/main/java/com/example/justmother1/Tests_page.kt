package com.example.justmother1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tests_page.*

class Tests_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests_page)
        next_tpg_btn.setOnClickListener {
            val intent = Intent(this, Tests_page2::class.java)
            startActivity(intent)
        }
    }
}
