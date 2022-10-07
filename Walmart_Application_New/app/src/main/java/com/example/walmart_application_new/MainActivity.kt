package com.example.walmart_application_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun forgotPassword(view: View) {
        txt_forgotpassword.setText("I'm clicked")
        //Toast.makeText(this, "I'm Clicked",Toast.LENGTH_LONG).show()
    }
}