package com.example.chatinterface

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapater(private val context : Activity, private val arrayList: ArrayList<User>):
    ArrayAdapter<User>(context, R.layout.row, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.row,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.Name)
        val msg = view.findViewById<TextView>(R.id.LastMSG)
        val msgTime = view.findViewById<TextView>(R.id.Time)

        name.text = arrayList[position].name
        msg.text = arrayList[position].lastMsg
        msgTime.text = arrayList[position].msgTime

        image.setImageResource(arrayList[position].imageId)

        return view

    }

}