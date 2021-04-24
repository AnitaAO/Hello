package com.zuri.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.textview)
        var plus = findViewById<Button>(R.id.button)
        plus.setOnClickListener {
            count++
            text.text = "$count"
        }
    }
}