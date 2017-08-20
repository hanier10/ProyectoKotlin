package hola.app.hsmp.com.proyectokotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Cursos (val nombre: String, val url:String)

class AprendiendoKotlin : Activity() {

    val react = Cursos("React", "react")
    val kot = Cursos("Kotlin", "kotlin")
    val cursoActual = react.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprendiendo_kotlin)

        val boton = findViewById(R.id.botoncito) as Button
        boton.setOnClickListener {
            view -> verEnPantalla(":3 Hello everybody")
        }


    }

    fun verEnPantalla(s : String)
    {
        val txt = findViewById(R.id.mensaje) as TextView
        txt.setText(s)
    }
}















//Ver en pantalla
//verEnPantalla("Curso de ${cursoActual.nombre} en platzi.com/${react.url}")