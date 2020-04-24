package com.example.betterlogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.betterlog.BetterLog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msg = "It really is!"
        BetterLog.betterD(msg)
    }
}
