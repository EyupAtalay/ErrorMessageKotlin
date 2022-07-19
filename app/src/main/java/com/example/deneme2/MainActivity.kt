package com.example.deneme2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun degistir(view: View){
  val gonderilecekyazi=  editTextTextPersonName.text
val intent = Intent(applicationContext,ikincisayfa::class.java)
intent.putExtra("verial",gonderilecekyazi.toString())
        startActivity(intent)




    }

}


