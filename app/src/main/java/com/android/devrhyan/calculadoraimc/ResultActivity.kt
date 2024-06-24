package com.android.devrhyan.calculadoraimc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    private lateinit var peso_info : TextView
    private lateinit var altura_info : TextView
    private lateinit var resultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        handleComponents()

        val bundle = intent.extras

        if(bundle != null){
            val peso = bundle.getDouble("Peso")
            val altura = bundle.getDouble("Altura")

            peso_info.text = "Peso informado: ${peso.toString()} kg"
            altura_info.text = "Altura informada: ${altura.toString()} m"

            caclImc(altura, peso)
        }
    }

    private fun handleComponents(){
        peso_info = findViewById(R.id.peso_info)
        altura_info = findViewById(R.id.altura_info)
        resultado = findViewById(R.id.resultado)
    }

    private fun caclImc(a : Double, p : Double) {
        val imc = p / (a * a)
        resultado.text = if(imc < 18.5){
             "Baixo"
        } else if (imc in 18.5..24.9) {
             "Normal"
        } else if (imc in 25.0..29.9){
             "Sobrepeso"
        } else {
             "Obeso"
        }
    }
}