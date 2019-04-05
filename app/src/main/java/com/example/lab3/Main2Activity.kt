package com.example.lab3

import android.content.Intent
//import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main2)
        setSupportActionBar(toolbar)
        //val binding: = DataBindingUtil.setContentView(this, R.layout.content_main2)
        val intent : Intent = intent
        val message : String = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        val agregarComentario = findViewById<Button>(R.id.addComentario)
        val comentario = findViewById<TextView>(R.id.comentario)

        val titulo = findViewById<TextView>(R.id.article_heading)
        val subtitulo = findViewById<TextView>(R.id.article_subheading)
        val cuadroTexto = findViewById<TextView>(R.id.article)

        if(message == "T") {
            titulo.text = R.string.info_title1.toString()
            subtitulo.text = R.string.article_subtitle1.toString()
            cuadroTexto.text = R.string.info_text1.toString()
        } else if(message.equals("A")) {
            titulo.text = R.string.info_title2.toString()
            subtitulo.text = R.string.article_subtitle2.toString()
            cuadroTexto.text = R.string.info_text2.toString()
        } else if(message.equals("I")){
            titulo.text = R.string.info_title3.toString()
            subtitulo.text = R.string.article_subtitle3.toString()
            cuadroTexto.text = R.string.info_text3.toString()
        }

        agregarComentario.setOnClickListener{
            val mensaje = Toast.makeText(applicationContext, comentario.text.toString(), Toast.LENGTH_SHORT)
            mensaje.show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
