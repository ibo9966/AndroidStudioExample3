package com.example.nesnetabanliprogramlama

open class Elma :Eatable,Squeezable {
    override fun howToEat() {
        println("Dilimle ve ye")
    }

    override fun howToSqueeze() {
        println("Bilendır ile sık")
    }
}