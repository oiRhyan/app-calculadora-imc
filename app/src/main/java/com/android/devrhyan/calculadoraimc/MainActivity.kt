package com.android.devrhyan.calculadoraimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var btn_action : Button
    private lateinit var altura: TextInputEditText
    private lateinit var peso: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        handleComponents()

        val IMCViewerResult = Intent(this, ResultActivity::class.java)


        btn_action.setOnClickListener {
            val altura = altura.text.toString()
            val peso = peso.text.toString()

            if(peso.isNotEmpty() && altura.isNotEmpty()){
                IMCViewerResult.putExtra("Peso", peso.toDouble())
                IMCViewerResult.putExtra("Altura", altura.toDouble())
            }
            startActivity(IMCViewerResult)
        }
    }

    private fun handleComponents(){
        btn_action = findViewById(R.id.btn_imc)
        altura = findViewById(R.id.altura_input)
        peso = findViewById(R.id.peso_input)
    }
}