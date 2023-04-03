package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1: Int? = null
    var number2: Int? = null
    var netice: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun topla(v: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Reqemleri daxil edin"
        }else{
            netice  = number1!! + number2!!
//            println(netice)
            textView.text = "Nəticə: $netice"
        }
    }
    fun cixar(v: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Reqemleri daxil edin"
        }else{
            netice  = number1!! - number2!!
//            println(netice)
            textView.text = "Nəticə: $netice"
        }
    }
    fun vur(v: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Reqemleri daxil edin"
        }else{
            netice  = number1!! * number2!!
//            println(netice)
            textView.text = "Nəticə: $netice"
        }
    }
    fun bol(v: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Reqemleri daxil edin"
        }else{
            netice  = number1!! / number2!!
//            println(netice)
            textView.text = "Nəticə: $netice"
        }
    }
}