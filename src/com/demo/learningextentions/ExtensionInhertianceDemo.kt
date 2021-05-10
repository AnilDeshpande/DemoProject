package com.demo.learningextentions

open class Vehicle()

class FourWheeler: Vehicle()


fun Vehicle.getName() = "Generic Vehicle"
fun FourWheeler.getName() = "Four Wheeler Vehicle"

fun main(array:  Array<String>){
    val car: Vehicle = FourWheeler()

    print(car.getName())
}
