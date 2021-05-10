package com.demo.learningextentions

class Radio(val frequency: String){
    fun play(){
        println("Playing Radio fm: ${frequency}")
    }
}

class Car(val radio: Radio, val carName: String){
    fun printCarName(){
        print(carName)
    }

    fun Radio.audioDetails(){
        printCarName()
        print(": ")
        radio.play()
    }

    fun showCarAudioDetails(){
        radio.audioDetails()
    }
}

fun main(array: Array<String>){
    val myCar = Car(Radio("94.7"), "Tata Nexon")
    myCar.showCarAudioDetails()
}