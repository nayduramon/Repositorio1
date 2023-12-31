package com.example.practicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class OpcionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }
        val btnIMC: Button = findViewById(R.id.btnIMC)
        btnIMC.setOnClickListener {
            val intent2 = Intent(this,IMCActivity::class.java)
            startActivity(intent2)
        }
        val btnSing: Button = findViewById(R.id.btnSing)
        btnSing.setOnClickListener {
            val intent4 = Intent(this,SingZActivity::class.java)
            startActivity(intent4)
        }
        val btnGener: Button = findViewById(R.id.btnGene)
        btnGener.setOnClickListener {
            val intent5 = Intent(this,GeneraActivity::class.java)
            startActivity(intent5)
        }
        val btnLP: Button = findViewById(R.id.btnLP)
        btnLP.setOnClickListener {
            val intent6 = Intent(this,ListActivity::class.java)
            startActivity(intent6)
        }
    }
}