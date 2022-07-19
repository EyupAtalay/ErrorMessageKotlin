package com.example.deneme2

import android.content.DialogInterface
import android.os.Bundle
import android.view.View

import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ikincisayfa.*

class ikincisayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikincisayfa)

        val intent = getIntent()
        val alinanveri = intent.getStringExtra("verial")

        button2.text = alinanveri
        val uyarimesaji = AlertDialog.Builder(this)

        uyarimesaji.setTitle("Fatih Sultan Mehmet misin?")
        uyarimesaji.setMessage("Ona göre kararını ver kardeşim uztma ok?")

        uyarimesaji.show()



    }

fun mesa(view: View) {
    val uyarimesaji = AlertDialog.Builder(this)

    uyarimesaji.setTitle("Fatih Sultan Mehmet misin?")
    uyarimesaji.setMessage("Ona göre kararını ver kardeşim uztma ok?")
    uyarimesaji.setPositiveButton("Evet Ben Fatihim",DialogInterface.OnClickListener { dialog, which ->
        Toast.makeText(this,"Yalan Söylüyorsun YALANN",Toast.LENGTH_LONG).show()


    })
    uyarimesaji.setNegativeButton("Hayır Ben Fatih Değilim",DialogInterface.OnClickListener { dialog, which ->
        Toast.makeText(this,"Sen Fatihsin",Toast.LENGTH_LONG).show()


    })

    uyarimesaji.show()



}
}