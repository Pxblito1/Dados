package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ClickableSpan
import android.widget.Toast
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var n = 0
    var m = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.iv1.setOnClickListener {
            n = Random.nextInt(1, 7)
            dado1(n)
            Toast.makeText(this, "valor $n", Toast.LENGTH_SHORT).show()
            binding.tv1.text = (n + m).toString()
        }
        binding.iv2.setOnClickListener {
             m = Random.nextInt(1, 7)
            dado2(m)
            Toast.makeText(this, "valor $m", Toast.LENGTH_SHORT).show()
            binding.tv1.text = (n + m).toString()
        }

    }

    fun dado1(j: Int) {
        var rsc = when (j){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        binding.iv1.setImageResource(rsc)
    }

    fun dado2(h: Int) {
        var rsc = when (h){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        binding.iv2.setImageResource(rsc)
    }
}