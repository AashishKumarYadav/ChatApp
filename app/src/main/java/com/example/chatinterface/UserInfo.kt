package com.example.chatinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val name = intent.getStringExtra("Name")
        val phone = intent.getStringExtra("Mobile")
        val image = intent.getIntExtra("Image",R.drawable.man)

        val infoName = findViewById<TextView>(R.id.Name)
        val infoNum = findViewById<TextView>(R.id.MobNo)
        val infoImage = findViewById<CircleImageView>(R.id.profile_image)

        infoImage.setImageResource(image)
        infoName.text = name
        infoNum.text = phone
    }
}