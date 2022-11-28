package com.example.nnidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val changeTitle = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            changeTitle.text = timesClicked.toString()
            val text = "Hello toast!"
            val duration = Toast.LENGTH_SHORT
            Toast.makeText(applicationContext, text, duration).show()
        }
    }
}
