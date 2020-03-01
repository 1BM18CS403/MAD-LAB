package com.example.buttons

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var ch = 1
    var font = 30f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = findViewById<View>(R.id.text1) as TextView
        val b1 =
            findViewById<View>(R.id.button1) as Button
        b1.setOnClickListener {
            t.textSize = font
            font = font + 5
            if (font == 50f) font = 30f
        }
        val b2 =
            findViewById<View>(R.id.button2) as Button
        b2.setOnClickListener {
            when (ch) {
                1 -> t.setTextColor(Color.RED)
                2 -> t.setTextColor(Color.GREEN)
                3 -> t.setTextColor(Color.BLUE)
                4 -> t.setTextColor(Color.CYAN)
                5 -> t.setTextColor(Color.YELLOW)
                6 -> t.setTextColor(Color.MAGENTA)
            }
            ch++
            if (ch == 7) ch = 1
        }
    }
}
