package com.example.udacityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollDice()

        }

        fun rollDice() {
            var btnRoll = findViewById<Button>(R.id.btnRoll)
            btnRoll.setOnClickListener {
                btnRoll.text = "Let's roll"

                var tvRoll: TextView = findViewById(R.id.tvRoll)
                java.util.Random().nextInt(6)
                tvRoll.text = "Rolled"

            }
        }

    }
