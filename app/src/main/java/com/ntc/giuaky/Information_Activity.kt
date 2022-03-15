package com.ntc.giuaky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ntc.giuaky.databinding.ActivityInformationBinding

class Information_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        information()


    }
    private fun information(){
        var name = intent.getStringExtra("Name")
        var email = intent.getStringExtra("Email")
        var phone = intent.getStringExtra("Phone")

        val txtname: TextView = findViewById(R.id.name)
        txtname.text = name
        val txtemail: TextView = findViewById(R.id.email)
        txtemail.text = email
        val txtphone: TextView = findViewById(R.id.phone)
        txtphone.text = phone
    }


}