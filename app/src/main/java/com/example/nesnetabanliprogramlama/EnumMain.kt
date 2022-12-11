package com.example.nesnetabanliprogramlama

fun main() {

    fun ucretAl(boyut:KonserverBoyut){

        when(boyut){
            KonserverBoyut.Kucuk-> println(20*30)
            KonserverBoyut.Orta->  println(30*30)
            KonserverBoyut.Buyuk-> println(40*30)
        }
    }

    ucretAl(KonserverBoyut.Orta)

}