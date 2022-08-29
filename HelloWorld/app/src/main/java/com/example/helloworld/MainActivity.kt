package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This is where user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        // Add Button to Layout

        // Setup Logic to know when user has tap
        findViewById<Button>(R.id.button).setOnClickListener{
        // Handle Button Tap
            Log.i("Cuthbert", "Tapped on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }


        //User can tap button to change background colour
    }
}