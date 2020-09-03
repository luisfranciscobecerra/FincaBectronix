package com.example.fincabectronix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(500)
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val analytics : FirebaseAnalytics = FirebaseAnalytics.getInstance(this) //llama a Firebase Analytics y lo guarda en una constante
        val bundle = Bundle() //crea una constante para el bundle
        bundle.putString("message", "Integración de Firebase completa" ) //clave y valor para el bundle
        analytics.logEvent("InitScreen", bundle)  //llama a la función logEvent (clave, parametros) y lanza el evento. La clave de la función es InitScreen y los parametros los pasamos a traves del bundle
    }
}