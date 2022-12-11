package com.example.nesnetabanliprogramlama

fun main() {

/*    val bmw =Araba()

    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    bmw.renk="beyaz"
    bmw.hiz=99
    bmw.calisiyorMu=true

    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)
*/
    val bmw=Araba("kırmızı", 10, false)

    /*println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    bmw.hiz=900
    println(bmw.hiz)*/

    bmw.bilgiAl()
    bmw.hiz=900
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.hizlan(100)
    bmw.hizlan(30)
    bmw.bilgiAl()
    bmw.yavasla(50)
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()

    val sahin=Araba("sarı", 10,true)
    sahin.bilgiAl()
    sahin.hizlan(100)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()


}