package com.example.nesnetabanliprogramlama

class Odev3 {
    //3->3*2*1

    fun faktoriyetHesaplama(sayi:Int):Int{
        var sonuc=1

        for (i in 1..sayi){//3->1,2,3
            sonuc=sonuc*i
        }
        return sonuc
    }

}