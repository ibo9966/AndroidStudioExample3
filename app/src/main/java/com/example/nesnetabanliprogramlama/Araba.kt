package com.example.nesnetabanliprogramlama

class Araba(var renk:String,var hiz:Int,var calisiyorMu:Boolean) {

    //var otobus:Otobus?=null       //İkisi gibide kullanılır.
    //lateinit var otobus:Otobus    //İkisi gibide kullanılır.

    fun calistir(){
        calisiyorMu=true
    }
    fun durdur(){
        calisiyorMu=false
        hiz=0
    }
    fun hizlan(kacKm:Int){
        hiz=hiz+kacKm
    }
    fun yavasla(kacKm:Int){
        hiz=hiz-kacKm
    }

    fun bilgiAl(){
        println("Renk: $renk")
        println("Hız: $hiz")
        println("Çalışıyor mu?: $calisiyorMu")
    }

}