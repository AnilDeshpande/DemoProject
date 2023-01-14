package com.demo.collections.lists

fun main(array: Array<String>) {

    val listOfCities = listOf<String>("Bangalore","Hyderabad","Hindupur","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")
//    println(listOfCities.elementAt(3))
//    println(listOfCities.first()) //firstOrNull, firstOrElse
//    println(listOfCities.last()) //lastOrNull , lastOrElse
//    println(listOfCities.elementAtOrNull(listOfCities.size+1))
//    println(listOfCities.elementAtOrElse (listOfCities.size+1)  { index -> "No value at $index"})
    println(listOfCities.first {it.startsWith("H", false)})
    //find
    //findOrNull
    //elementAtOrNull
    //elementAtOrElse
}