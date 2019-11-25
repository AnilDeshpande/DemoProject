package com.demo.controlflows

fun main(args: Array<String>) {
    for(i in 1..5){
        print("$i \t")
    }

    println()

    for(i in 1..5 step 3){
        print("$i \t")
    }

    println()

    for(i in 1.rangeTo(5)){
        print("$i \t")
    }

    println()

    for(i in 5 downTo 1){
        print("$i \t")
    }

    println()

    for(i in 5 downTo 1 step 2){
        print("$i \t")
    }

    println()

    for(i in 1 until 10){
        print("$i\t")
    }

    println()

    val sampleArray = arrayOf(34,23,54,65,67,76)
    for(number in sampleArray){
        print("$number\t")
    }
}