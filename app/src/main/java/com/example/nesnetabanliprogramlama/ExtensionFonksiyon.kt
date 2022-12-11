package com.example.nesnetabanliprogramlama

fun main() {

/*    fun Int.carpi(sayi:Int):Int{
        return this * sayi
    }

    val sonuc =5.carpi(2)
    println("sonuç: $sonuc")*/

// Üstteki ve alttaki aynıdır. Fark infix methodudur.


    infix fun Int.carpi(sayi:Int):Int{
        return this * sayi
    }

    val sonuc =5 carpi 2
    println("sonuç: $sonuc")
}