package com.example.nesnetabanliprogramlama

class Hesaplayici {

    fun topla(sayi1:Int,sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double,sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Double){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Int,ad:String){
        println("Toplam yapan: $ad Sonuç: ${sayi1+sayi2}")
    }
}