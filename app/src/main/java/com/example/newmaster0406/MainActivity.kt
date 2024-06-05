package com.example.newmaster0406

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var user = User("Sergey", "000000", 25)
        var user2 = User("Andrey", "11111", 32)
        user.addAge(10)
        user2.addAge(2)

        user.printUserInfo()
        user2.printUserInfo()
    }



}