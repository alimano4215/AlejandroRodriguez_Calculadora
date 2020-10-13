package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var newOp = true
    var oldNum = ""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var nombre : String = intent.getStringExtra("name1").toString()
        var apellido : String = intent.getStringExtra("name2").toString()

        var names = findViewById<TextView>(R.id.names)
        names.text = "Hola  " + nombre + " "+apellido
    }

    fun buNumberEvent(view:View){
        if(newOp)
            numeros.setText("")
        newOp = false
        val buSelect = view as Button
        var buClickValue:String = numeros.text.toString()
        when(buSelect.id){
            btn0.id->{ buClickValue+="0" }
            btn1.id->{ buClickValue+="1" }
            btn2.id->{ buClickValue+="2" }
            btn3.id->{ buClickValue+="3" }
            btn4.id->{ buClickValue+="4" }
            btn5.id->{ buClickValue+="5" }
            btn6.id->{ buClickValue+="6" }
            btn7.id->{ buClickValue+="7" }
            btn8.id->{ buClickValue+="8" }
            btn9.id->{ buClickValue+="9" }
        }
        numeros.setText(buClickValue)
    }

    fun operar (view: View) {
        newOp = true
        oldNum = numeros.text.toString()
        val buSelect : Button = view as Button
        when (buSelect.id) {
            btnPlus.id -> {op = "+"}
            btnDiv.id -> {op = "/"}
            btnMul.id -> {op = "*"}
            btnRes.id -> {op = "-"}
        }
    }

    fun resultado (view: View){


            var newNum : String = numeros.text.toString()
            var res = 0
            when (op){
                "+" -> {res = oldNum.toInt() + newNum.toInt()}
                "/" -> {res = oldNum.toInt() / newNum.toInt()}
                "*" -> {res = oldNum.toInt() * newNum.toInt()}
                "-" -> {res = oldNum.toInt() - newNum.toInt()}
            }
            numeros.setText(res.toString())
    }

    fun ac (view: View) {
        numeros.setText("0")
        newOp = true
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