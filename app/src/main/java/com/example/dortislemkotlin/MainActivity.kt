package com.example.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1 :Int?=null
    var sayi2 :Int?=null
    var islem=DortIslem()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view : View){
        sayi1=editText.text.toString().toIntOrNull()
        sayi2=editText2.text.toString().toIntOrNull()


        if (sayi1==null || sayi2==null){
            textView.text="Lütfen Sayı Giriniz:!!!"
        }else{

            textView.text="Sonuç: ${islem.topla(sayi1!!,sayi2!!)}"
        }
    }

    fun cikar(view : View){
        sayi1=editText.text.toString().toIntOrNull()
        sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null){
            textView.text="Lütfen Sayı Giriniz:!!!"
        }else{
            textView.text="Sonuç: ${islem.cikar(sayi1!!,sayi2!!)}"
        }
    }

    fun carp(view : View){
        var sayi1=editText.text.toString().toIntOrNull()
        var sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null){
            textView.text="Lütfen Sayı Giriniz:!!!"
        }else{

            textView.text="Sonuç: ${islem.carp(sayi1!!,sayi2!!)}"
        }
    }

    fun bol(view : View){
        var sayi1=editText.text.toString().toIntOrNull()
        var sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null){
            textView.text="Lütfen Sayı Giriniz:!!!"
        }else{

            textView.text="Sonuç: ${islem.bol(sayi1!!,sayi2!!)}"
        }
    }
}