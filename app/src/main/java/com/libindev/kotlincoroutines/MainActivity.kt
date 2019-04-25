package com.libindev.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Start")

// Start a coroutine
        GlobalScope.launch {
            delay(1000)
            Log.d("DELAY","Hello")
        }

        Thread.sleep(2000) // wait for 2 seconds
        Log.d("STOP","Stopped")
    }
}
