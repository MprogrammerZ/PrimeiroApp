package com.marcio.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val number1 = edit2.text
            val number2 = edit1.text

            Toast.makeText(this, "Variable 1: $number1 \n Variable 2: $number2", Toast.LENGTH_SHORT).show()
        }



    }
}