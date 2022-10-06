package com.miu.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var list = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textValue = findViewById<EditText>(R.id.text1)
        var textValue2 = findViewById<TextView>(R.id.textView)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener {
            textValue2.text = list.random()
        }
        btn1.setOnClickListener {
            list.add(textValue.text.toString())

        }
    }
}