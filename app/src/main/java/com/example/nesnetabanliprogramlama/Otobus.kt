package com.example.nesnetabanliprogramlama

class Otobus (var kapasit:Int,var nereden:String, var nereye :String,var mevcutYolcu:Int) {

    fun yolcuAl(yolcu:Int){
        mevcutYolcu=mevcutYolcu + yolcu
    }
    fun yolcuIndir(yolcu:Int){
        mevcutYolcu=mevcutYolcu - yolcu
    }
    fun bilgiAl(){
        println("Kapasit: $kapasit")
        println("Nereeden: $nereden")
        println("Nereye: $nereye")
        println("Yolcu Sayısı: $mevcutYolcu")
    }
}