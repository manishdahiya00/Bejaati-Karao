package com.example.bejaatikarao

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
import com.example.bejaatikarao.databinding.ActivityBejaatiBinding

class BejaatiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBejaatiBinding = ActivityBejaatiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bejaatiList = listOf(
                    "Dil Ki Tamanna Hai Ke Main Bhi,\n" +
                    "Apni Palko Pe Bithhaun Tujhko,\n" +
                    " Bas Tu Apna Wajan Kam Kar Le,\n" +
                    " Toh Palkon Par Bithh Lun Tujhko.",
                    " Kya Mast Mausam Aaya Hai,\n" +
                    " Har Taraf Pani Hi Pani Laya Hai,\n" +
                    " Tum Ghar Se Baahar Mat Niklna,\n" +
                    " Varna Log Kahenge Barsat Hui Nahi,\n" +
                    " Aur Mendhak Nikal Aaya Hai..",
                    " Aasmaan Jitna Neela Hai,\n" +
                    " SurajMukhi Jitna Peela Hai,\n" +
                    " Paani Jitna Geela Hai,\n" +
                    " Aapka Screw Utna Hi Dheela Hai..",
                    " Paani Aane Ki Baat Karte Ho\n" +
                    " Dil Jlaane Ki Baat Karte Ho\n" +
                    " Chaar Din Se Muh Nhi Dhoya,Tum Nhaane Ki Baat Karte Ho",
                    " Taarif K Kaabil Hum Kahan, \n" +
                    " Charcha To Aapki Chalti H, \n" +
                    " Sab Kuch To H Aapke Paas ,\n" +
                    " Bas Seeng Or Punch Ki Kami Khalti H"
        )

        val colorMap = mapOf(
            "Red" to "#FF0000",
            "Green" to "#00FF00",
            "Blue" to "#0000FF",
            "Orange" to "#FFA500",
            "Yellow" to "#FFFF00"
        )

        val intentColor = intent.getStringExtra("COLOR")
        val colorHex = colorMap[intentColor]
        val color = Color.parseColor(colorHex).toDrawable()
        binding.main.background = color
        val bejaati = bejaatiList.random()
        binding.textView.text = bejaati
    }
}
