package com.example.nesnetabanliprogramlama

fun main() {

    val kamilKoc=Otobus(50,"Bursa", "Ankara",10)
   /* println(kamilKoc.kapasit)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)*/

    kamilKoc.bilgiAl()

    kamilKoc.kapasit=100
    kamilKoc.nereden="İzmir"
    kamilKoc.nereye="İstanbul"
    kamilKoc.mevcutYolcu=30

    kamilKoc.bilgiAl()

    /*println(kamilKoc.kapasit)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)*/

    kamilKoc.yolcuAl(20)
    kamilKoc.bilgiAl()

    val pamukKale=Otobus(50,"Bursa","İzmit",5)
    pamukKale.bilgiAl()
    pamukKale.yolcuAl(10)
    pamukKale.bilgiAl()
}