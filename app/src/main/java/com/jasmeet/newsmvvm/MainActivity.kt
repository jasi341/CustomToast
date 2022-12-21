package com.jasmeet.newsmvvm

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view:View = LayoutInflater.from(this).inflate(R.layout.custom_toast, null)

        val toast = Toast(this)
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 500, 400)
        toast.duration = Toast.LENGTH_LONG
        toast.view = view

        button = findViewById(R.id.button)


         button.setOnClickListener {
             toast.show()
         }


    }
}