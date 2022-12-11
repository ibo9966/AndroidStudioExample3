package com.example.nesnetabanliprogramlama

fun main() {
    val k1=Kategoriler(1,"Dram")
    val k2=Kategoriler(2,"Komedi")

    val y1=Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2=Yonetmenler(2,"Quentin Tarantino")

    val f1=Filmler(1,"Django", 2013,k1,y2)
    println("Film id: ${f1.filmId}")
    println("Film ad: ${f1.filmAd}")
    println("Film yıl:${f1.filmYıl}")
    println("Film kategori: ${f1.kategori.kategoriAd}")
    println("Film yönetmeni: ${f1.yonetmen.yonetmenAd}")
}