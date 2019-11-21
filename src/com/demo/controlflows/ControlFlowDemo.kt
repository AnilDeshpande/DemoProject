package com.demo.controlflows

fun main(args: Array<String>){


    // if else
    /*val num1 = 50
    val num2 = 20

    var maxNumber = if (num1 > num2 ) num1 else num2

    println(" The maximum number is $maxNumber")*/

    //When

    val planetPosition = 6

    var message: String?

    /*message = when(planetPosition) {
        0 -> "You must be joking"
        1 -> "You are Mercury"
        2 -> "You are Venus"
        3 -> "You are Earth"
        4 -> "You are Mars"
        5 -> "You are Saturn"
        6 -> "You are Jupiter"
        7 -> "You are Uranus"
        8 -> "You are Neptune"
        9 -> "Pluto, You are no more a planet"
        else -> "I am not sure what you are"
    }*/


    // Range operator
     /*message = when(planetPosition) {
        0 -> "You must be joking"
        in 1..4 -> "You are inside inner solar system"
        in 5..8 -> "You are in outer solar system"
        9 -> "Pluto, You are no more a planet"
        else -> "I am not sure what you are"
    }*/


    /*val sampleName = "Anil Deshpande"
    val splitString = sampleName.split(" ")

    val initials = when {
        splitString.size == 3 -> "${splitString.get(0).get(0)}${splitString.get(1).get(0)}${splitString.get(2).get(0)}"
        splitString.size == 2 -> "${splitString.get(0).get(0)}${splitString.get(1).get(0)}"
        else -> "Unknown"
    }

    println(initials)*/

    val sampleVarible: Any = 10.00

    message = when(sampleVarible){
        is Float -> "This is a float data type"
        is Double -> "This is a double data type"
        is Int -> "This is a Int data type"
        is Long -> "This is a Long data type"
        else -> "Unhandled data type"
    }

    println(message)

}