package com.demo.collections.lists

data class Rectangle(val height: Int, val width: Int) {
    val area: Int get() = height * width
}

fun firstNotNullOfDemo() {
    val rectangles = listOf(
        Rectangle(3, 4),
        Rectangle(1, 8),
        Rectangle(6, 3),
        Rectangle(4, 3),
        Rectangle(5, 7)
    )

    val largeArea = rectangles.firstNotNullOf { it.area.takeIf { area -> area >= 15 } }
    val largeAreaOrNull = rectangles.firstNotNullOfOrNull { it.area.takeIf { area -> area >= 100 } }

    println(largeArea) // 18
    println(largeAreaOrNull) // 18
}

fun main(array: Array<String>) {

    val listOfCities = listOf<String>("Hubli","Bangalore","Hyderabad","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")
//    println(listOfCities.elementAt(3))

//    println(listOfCities.first()) //firstOrNull
//    println(listOfCities.first {it.startsWith("H", false)})

//    println(listOfCities.last()) //lastOrNull ,

//    println(listOfCities.elementAtOrNull(listOfCities.size+1))
//    println(listOfCities.elementAtOrElse (listOfCities.size+1)  { index -> "No value at $index"})


    //find
//    println("Find : ${listOfCities.find { it.length > 8 }}")
//    println("FindLast : ${listOfCities.findLast { it.length > 8 }}")

    //firstNotNullOf
//   firstNotNullOfDemo()

    //random
//    println("Random : ${listOfCities.random()}")

    //check existence
    println("Contains : ${listOfCities.contains("New Delhi")}")
    println("Contains : ${listOfCities.contains("Kolkata")}")
    println("IsEmpty : ${listOfCities.isEmpty()}")
    println("isNotEmpty : ${listOfCities.isNotEmpty()}")
    println("isNullOrEmpty : ${listOfCities.isNullOrEmpty()}")

}