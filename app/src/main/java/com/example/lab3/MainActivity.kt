package com.example.lab3

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var mostrando = false
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEstrella = findViewById<Button>(R.id.starButton)
        val texto = findViewById<TextView>(R.id.textView)
        val textoEdit = findViewById<TextView>(R.id.editText)
        val ingresado = findViewById<TextView>(R.id.textIngresado)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        //Funcion de boton para mostrar o esconder los views del Main Activity
        //Muestra en el Text View escondido el valor ingresado en el Edit Text
        buttonEstrella.setOnClickListener{
            if (!mostrando){
                ingresado.text = textoEdit.text.toString()
                ingresado.visibility = View.VISIBLE
                textoEdit.visibility = View.GONE
                texto.visibility = View.GONE
                mostrando = true
            }
            else{
                ingresado.visibility = View.GONE
                textoEdit.visibility = View.VISIBLE
                texto.visibility = View.VISIBLE
                mostrando = false
            }
        }

        //Click listener del boton 1, manda un mensaje la Main 2 Activity a traves de putExtra()
        button1.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(EXTRA_MESSAGE, "T")
            startActivity(intent)
        }

        //Click listener del boton 2, manda un mensaje la Main 2 Activity a traves de putExtra()
        button2.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(EXTRA_MESSAGE, "A")
            startActivity(intent)
        }

        //Click listener del boton 3, manda un mensaje la Main 2 Activity a traves de putExtra()
        button3.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(EXTRA_MESSAGE, "I")
            startActivity(intent)
        }
    }

    companion object {
        const val EXTRA_MESSAGE = "com.example.android.lab3.extra.MESSAGE"
    }
}