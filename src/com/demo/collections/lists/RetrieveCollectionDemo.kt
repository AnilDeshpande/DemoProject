package com.demo.collections.lists

fun main(array: Array<String>) {
    //Slice, Take and Drop, Chunked, Windowed

    val listOfCities = listOf<String>("Hubli","Bangalore","Hyderabad","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")

    //Slice
//    println(listOfCities.slice(0..2))
//    println(listOfCities.slice(0..5 step 2))
//    println(listOfCities.slice(setOf(2,5,6)))


      //take, drop
//    println("take demo:  ${listOfCities.take(4)}")
//    println("takeDrop: ${listOfCities.drop(3)}")

    //takeWhile, dropWhile
//    println("take while ${listOfCities.takeWhile { it.length >= 4 }}")
//    println("dropWhile:  ${listOfCities.dropWhile { it.length >= 4 }}")

    //takeLast, dropLast
//    println("takeLast: ${listOfCities.takeLast(3)}")
//    println("dropLast ${listOfCities.dropLast(3)}")


    //takeLastWhile, dropLastWhile
//    println("takeLastWhile: ${listOfCities.takeLastWhile { it[0] >= 'P' }}")
//    println("dropLastWhile ${listOfCities.dropLastWhile { it[0] >= 'P' }}")

    // chunked
    println("Chunked : "+listOfCities.chunked(3))
//    println(listOfCities.chunked(3){list: List<String> -> list.fold(""){acc: String, s: String -> acc + s.get(0) } })

    //windowed
    println("Windowed: "+listOfCities.windowed(3,2,true))
}