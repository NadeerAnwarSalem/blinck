package com.enine.blinck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

lateinit var regBtn : Button
lateinit var regEmail : EditText
lateinit var regPass : EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        regBtn = findViewById(R.id.regBtn)
        regEmail = findViewById(R.id.emailReg)
        regPass = findViewById(R.id.passwordReg)

        val email = regEmail.text.toString()
        val pass = regPass.text.toString()

        Log.d("MainActivity", "email is: $email")
        Log.d("MainActivity", "password is: $pass")


    }
}