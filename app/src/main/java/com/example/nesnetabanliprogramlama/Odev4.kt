package com.example.nesnetabanliprogramlama

class Odev4 {

    fun kelimeAdeti(kelime:String,harf:Char){ // Ankara , a

        var sonuc=0

        for (k in kelime){ // A n k a r a

            if (k == harf){ //A!=a , n!=A , k!=a , a==a, r!=a, a==a
                sonuc+=1
            }
        }

        println("Harf Adeti: $sonuc")

    }
}