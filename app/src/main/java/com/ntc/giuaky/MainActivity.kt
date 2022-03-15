package com.ntc.giuaky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ntc.giuaky.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        login()

    }
    private fun login(){
        binding.login.setOnClickListener {
            val name = binding.txtname.text.toString()
            val email = binding.txtemail.text.toString()
            val phone = binding.txtnumber.text.toString()

        if (name.length == 0 || email.length == 0 || phone.length == 0){
            Toast.makeText(this, "Please complete full information to login", Toast.LENGTH_SHORT).show()
        }else{
            val name: String = binding.txtname.text.toString()
            val email: String = binding.txtemail.text.toString()
            val phone: String = binding.txtnumber.text.toString()
            val intent = Intent(this, Information_Activity::class.java)
            intent.action = Intent.ACTION_SEND
            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            intent.putExtra("Phone", phone)
            startActivity(intent)
            finish()
        }
        }
    }

}