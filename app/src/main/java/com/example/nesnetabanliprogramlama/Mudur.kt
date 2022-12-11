package com.example.nesnetabanliprogramlama

class Mudur:Personel() {

    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel){

        if (p is Ogretmen){
            p.maasArttir()
        }
        if (p is Isci){
            println("İşçiler terfi alamaz.")
        }
    }
}