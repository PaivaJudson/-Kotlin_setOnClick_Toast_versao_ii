package com.judson.instituto_de_cdigo_um_vi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_botao.setOnClickListener {
            var texto: String = edt_texto.text.toString()
            Toast.makeText(applicationContext, "Olá "+texto+" tudo bem?", Toast.LENGTH_LONG).show()
        }

    }
}