package com.demo.lambademo

data class College(val name: String,
                   var affiliation: String,
                   val city: String )

fun main(array: Array<String>) {

    //Destructuring
    val college = College("IIT","Autonomous/Deemed", "Madras")
    val (collegeName, universityAffiliation, estCity) = college

    println("${collegeName}, ${universityAffiliation} is in ${estCity}")

    //Pair

    val nationCapital1: Pair<String,String> = Pair("India","New Delhi")
    val nationCapital2: Pair<String,String> = Pair("Pakistan","Islamabad")
    val nationCapital3: Pair<String,String> = Pair("Sri Lanka","Columbo")

    val printNationCapitals: (Pair<String,String>)->Unit = { pair -> println("${pair.first}'s capital is ${pair.second}") }

    val listOfNations = listOf(nationCapital1,nationCapital2,nationCapital3)

    //listOfNations.forEach(printNationCapitals)

    //Passing arguments
    printKeyValuePairs(listOfNations,printNationCapitals)
}

fun printKeyValuePairs(nationStates: List<Pair<String,String>>, lambda:(Pair<String,String>)->Unit ): Unit{
    nationStates.forEach(lambda)
}