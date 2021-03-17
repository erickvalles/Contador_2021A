package mx.udg.cuvalles.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    //Declaración de variables
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Inicialización de las variables
        btnIncrementar = findViewById(R.id.btnIncrementar)
        tvContador = findViewById(R.id.tvNumero)



        btnIncrementar.setOnClickListener {
            contador++
            tvContador.text = "$contador"
        }

    }
}