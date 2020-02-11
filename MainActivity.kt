package com.example.buttons

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //var ch = 1
    //var font = 30f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = findViewById<View>(R.id.textView) as TextView
        val b1 =
            findViewById<View>(R.id.button) as Button

        val b2 =
            findViewById<View>(R.id.button) as Button
        b2.setOnClickListener { t.setTextColor(Color.GREEN)
            val b1 =
                findViewById<View>(R.id.button2) as Button

            val b2 =
                findViewById<View>(R.id.button2) as Button
            b2.setOnClickListener { t.setTextColor(Color.BLUE)}
    }
}}
