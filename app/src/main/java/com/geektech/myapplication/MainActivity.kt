package com.geektech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.geektech.myapplication.databinding.ActivityMainBinding
import com.geektech.myapplication.extensions.loadImage
import com.geektech.myapplication.extensions.makeToast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val imageList = arrayListOf(
        "https://i.imgur.com/7eGqaZA.jpeg", "https://i.imgur.com/7jHwjCc.jpeg",
        "https://i.imgur.com/LsuGF4O.jpeg", "https://i.imgur.com/fleOtn7.jpeg",
        "https://i.imgur.com/rkqttcs.jpeg", "https://i.imgur.com/0ZUkla6.jpeg",
        "https://i.imgur.com/MLh1ero.jpeg", "https://i.imgur.com/OccArbL.jpeg",
        "https://i.imgur.com/EX8ivRd.jpeg", "https://i.imgur.com/bBYPc19.jpeg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnRandom.setOnClickListener {
                val randomImage = Random.nextInt(imageList.size)
                val randomIndex = imageList[randomImage]
                ivImage.loadImage(randomIndex)
            }
            btnSubmit.setOnClickListener {
                imageList.add(etSent.text.toString())
                makeToast("Не правильно введен URL")
            }
        }


    }
}