package com.example.shubhamdev1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

//import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe =findViewById<Button>(R.id.button1)
        val tvMyTextView = findViewById<TextView>(R.id.text1)
        var TimesClicked = 0
        //btnClickMe.text = "Do not Click"
        btnClickMe.setOnClickListener{
            btnClickMe.text= "Don't Click Again"
            tvMyTextView.text = "Last Warning"
            TimesClicked+=1
            Toast.makeText(this,"Last Warning No." + TimesClicked.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}