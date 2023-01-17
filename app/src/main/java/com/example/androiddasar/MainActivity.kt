package com.example.androiddasar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//       panggil fungsi
      plus()
        minus()

        next()
    }

    fun plus(){
        var textHello :TextView = findViewById(R.id.textHello)
        var buttonHello :FloatingActionButton = findViewById(R.id.btnHello)

        buttonHello.setOnClickListener {
            //konversi dari object widget ke string ke integer
            var textInteger :Int = textHello.text.toString().toInt()
            textInteger+=1
//          set nilai textHello harus dalam bentuk string
            textHello.text = textInteger.toString()
        }
    }
    fun minus(){
        var textHello :TextView = findViewById(R.id.textHello)
        var buttonHello :FloatingActionButton = findViewById(R.id.btnMinus)

        buttonHello.setOnClickListener {
            //konversi dari object widget ke string ke integer
            var textInteger :Int = textHello.text.toString().toInt()
            textInteger-=1
//          set nilai textHello harus dalam bentuk string
            if(textInteger<0){
                Toast.makeText(this,"Value can't minus",Toast.LENGTH_SHORT).show()
            }else{
                textHello.text = textInteger.toString()
            }


        }
    }

    fun next(){
        val btnNext :Button = findViewById(R.id.btnNext)

        btnNext.setOnClickListener {
            // Intent diisi dengan komponen this, activity yang di tuju
            val intent = Intent(this,NextActivity::class.java)
            startActivity(intent)
        }

    }


}