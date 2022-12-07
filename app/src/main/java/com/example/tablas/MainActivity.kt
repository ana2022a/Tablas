package com.example.tablas


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAbrir = findViewById( R .id.btnPracticar)

        btnAbrir.setOnClickListener {
            val abrirPractica =  Intento ( this , PracticaActivity :: class .java)

            startActivity(abrirPractica)
        }
    }
}