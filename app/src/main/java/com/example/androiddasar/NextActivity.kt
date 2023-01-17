package com.example.androiddasar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        back()
        tambah()
        kurang()
        kali()
        bagi()
    }

    fun back(){
        val btnBack : Button = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
    fun tambah(){
        val btnTambah: Button = findViewById(R.id.btnTambah)
        var txtAngka1 : EditText = findViewById(R.id.textNumber1)
        var txtAngka2 : EditText = findViewById(R.id.textNumber2)
        var txtHasil : EditText = findViewById(R.id.textNumber3)

        btnTambah.setOnClickListener {
            var angka1:Int = txtAngka1.text.toString().toInt()
            var angka2:Int = txtAngka2.text.toString().toInt()
            var hasil :Int = 0
            hasil = angka1 + angka2

            txtHasil.setText(hasil.toString())

        }
    }


    private fun bagi() {
        val btnBagi: Button = findViewById(R.id.btnBagi)
        var txtAngka1 : EditText = findViewById(R.id.textNumber1)
        var txtAngka2 : EditText = findViewById(R.id.textNumber2)
        var txtHasil : EditText = findViewById(R.id.textNumber3)

        btnBagi.setOnClickListener {
            var angka1:Int = txtAngka1.text.toString().toInt()
            var angka2:Int = txtAngka2.text.toString().toInt()
            var hasil :Int = 0
            hasil = angka1 / angka2

            txtHasil.setText(hasil.toString())

        }
    }

    private fun kali() {
        val btnKali: Button = findViewById(R.id.btnKali)
        var txtAngka1 : EditText = findViewById(R.id.textNumber1)
        var txtAngka2 : EditText = findViewById(R.id.textNumber2)
        var txtHasil : EditText = findViewById(R.id.textNumber3)

        btnKali.setOnClickListener {
            var angka1:Int = txtAngka1.text.toString().toInt()
            var angka2:Int = txtAngka2.text.toString().toInt()
            var hasil :Int = 0
            hasil = angka1 * angka2

            txtHasil.setText(hasil.toString())

        }
    }

    private fun kurang() {
        val btnKurang: Button = findViewById(R.id.btnKurang)
        var txtAngka1 : EditText = findViewById(R.id.textNumber1)
        var txtAngka2 : EditText = findViewById(R.id.textNumber2)
        var txtHasil : EditText = findViewById(R.id.textNumber3)

        btnKurang.setOnClickListener {
            var angka1:Int = txtAngka1.text.toString().toInt()
            var angka2:Int = txtAngka2.text.toString().toInt()
            var hasil :Int = 0
            hasil = angka1 - angka2

            txtHasil.setText(hasil.toString())

        }
    }

}