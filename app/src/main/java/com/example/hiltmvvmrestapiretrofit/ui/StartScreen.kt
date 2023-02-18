package com.example.hiltmvvmrestapiretrofit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.hiltmvvmrestapiretrofit.R

class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        Handler().postDelayed(Runnable {
            var i= Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}