package com.demo.collections.lists

fun main(array: Array<String>) {
    //Slice, Take and Drop, Chunked, Windowed

    val listOfCities = listOf<String>("Bangalore","Hyderabad","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")

    println(listOfCities.slice(0..2))
    println(listOfCities.slice(0..5 step 2))
    println(listOfCities.slice(setOf(2,5,6)))

    println("take demo:  ${listOfCities.take(4)}")
    println("take while ${listOfCities.takeWhile { it.length <= 5 }}")
    println("takeLast: ${listOfCities.takeLast(3)}")
    println("takeLastWhile: ${listOfCities.takeLastWhile { it[0] <= 'P' }}")
    println("takeDrop: ${listOfCities.drop(3)}")
    println("dropWhile:  ${listOfCities.dropWhile { it.length >= 6 }}")
    println("dropLast ${listOfCities.dropLast(3)}")
    println("dropLastWhile ${listOfCities.dropLastWhile { it[0] <= 'C' }}")
    // chunked
    println(listOfCities.chunked(3))
    println(listOfCities.windowed(3,1,true))
}