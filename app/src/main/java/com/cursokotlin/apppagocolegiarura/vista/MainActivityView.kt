package com.cursokotlin.apppagocolegiarura.vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.apppagocolegiarura.R
import com.cursokotlin.apppagocolegiarura.presentador.clsColegiaturaPresentador

class MainActivityView : AppCompatActivity() {
    private lateinit var txtMatricula: EditText
    private lateinit var txtNombre: EditText
    private lateinit var txtP1: EditText
    private lateinit var  txtP2: EditText
    private lateinit var txtP3: EditText
    private lateinit var  txtColegiatura: EditText
    private lateinit var btnPromedio: Button
    private lateinit var btnEstatus: Button
    private lateinit var btnColegiatura: Button
    private lateinit var txtDatos: TextView
    private lateinit var txtPromedioG: TextView
    private lateinit var txtColegiaturaA: TextView
    private lateinit var txtColegiaturaF: TextView
    private lateinit var presentador: clsColegiaturaPresentador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtMatricula = findViewById(R.id.txtMatricula)
        txtNombre = findViewById(R.id.txtNombre)
        txtP1 = findViewById(R.id.txtPromedio1)
        txtP2 = findViewById(R.id.txtPromedio2)


    }
}