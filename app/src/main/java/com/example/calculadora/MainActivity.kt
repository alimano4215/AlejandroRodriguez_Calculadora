package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saltar(view: View) {

        var editTextName1 = findViewById<EditText>(R.id.editName)
        var editTextName2 = findViewById<EditText>(R.id.editName2)

        var name1: String = editTextName1.text.toString()
        var name2: String = editTextName2.text.toString()


            var miIntent = Intent(this, MainActivity2::class.java)

            miIntent.putExtra("name1", name1)
            miIntent.putExtra("name2", name2)

            startActivity(miIntent)
    }

    fun salir(view: View) {
    finish()

    }
    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
    }
}