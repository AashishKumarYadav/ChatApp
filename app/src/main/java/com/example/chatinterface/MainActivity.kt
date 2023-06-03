package com.example.chatinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Aashish Kumar Yadav","Tanya", "Aryan Singh", "Sudarshan","Rajit","Surjeet")
        val lastMsg = arrayOf("I'm always good","How are you?","what are you doing","Party kab dega?","Aur kya hal hai?","I need Hotspot")
        val msgTime = arrayOf("07:00 PM","08:45 AM","12:00 PM","06:34 AM","02:19 PM","11:56 PM")
        val mobNo = arrayOf("9897141344","3864991630","9825473894","9736294514","8725291859","7837551938")
        val imgId = arrayOf(R.drawable.ashish,R.drawable.girl,R.drawable.hacker,R.drawable.man,R.drawable.gamer,R.drawable.profile)

        userArrayList = ArrayList()

        for(i in name.indices) {
            val user = User(name[i], lastMsg[i], msgTime[i], mobNo[i], imgId[i])

            userArrayList.add(user)
        }

            val listView = findViewById<ListView>(R.id.listView)

            listView.isClickable = true

            listView.adapter = MyAdapater(this, userArrayList)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val userName = name[i]
            val userMob = mobNo[i]
            val image = imgId[i]

            val i = Intent(this,UserInfo::class.java)

            i.putExtra("Name",userName)
            i.putExtra("Mobile",userMob)
            i.putExtra("Image",image)
            startActivity(i)

        }


    }
}