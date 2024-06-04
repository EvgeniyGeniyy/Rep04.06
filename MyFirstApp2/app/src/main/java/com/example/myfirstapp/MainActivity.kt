package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //lateinit var bidingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        var number1 = 9
        val numbers = arrayOf(4, 9, 0, 6)
        Log.d("MyLog", "Nubber: ${numbers[2]}")
    }
}

