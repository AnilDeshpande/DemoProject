package com.demo.collections.lists


@OptIn(ExperimentalStdlibApi::class)
fun main(array: Array<String>){
    var people = listOf<Person>(
        Person("Anil","Deshpande","Indian",40),
        Person("Amit","Behl","Indian",26),
        Person("George","Orwel","UK",50),
        Person("Hazel","Keech","UK",26),
        Person("George","Washington","USA",50),
        Person("Anees","Khan","Pakistan",30),
        Person("John","Keech","Australia",60),
        Person("James","Blend","Australia",15),
    )

    // Map
    var tranformedList  = people.map { if(it.nationality !== "Indian") it.firstName else null }
    //println(tranformedList)

    var cityStates = buildMap<String,String> {
        put("Bangalore", "Karnataka")
        put("Mumbai", "Maharashtra")
        put("Panjim", "Goa")
        put("Hyderabad", "Telangana")
        put("Chennai", "Tamil Nadu")
    }

    //println(cityStates.mapKeys { it.key.uppercase() })
    //println(cityStates)

    //Zipping
    var cities = listOf<String>("Bangalore","Mumbai","London","Bristol","New York","Lahore","Perth","Canberra")
    val zippedCity = cities.zip(people)
    //println(zippedCity.unzip().second)

    //Associate
    val assocaitedList = people.associateBy { it.firstName }
    //assocaitedList.forEach { first, second -> println("${first} -> ${second}") }

    //Flatten
    val listOfNames1 = listOf<String>("Anil","Ajay","Ankit")
    val listOfNames2 = listOf<String>("George","Json","Michele")
    val listOfNames3 = listOf<String>("Anna","Khan","Tom")

    val listOfList = listOf<List<String>>(listOfNames1, listOfNames2, listOfNames3)
    //println(listOfList.flatMap { it })

    //String Presentation
    var sampleBuffer  = StringBuffer("String Buffer Starting point: ")
    cities.joinTo(sampleBuffer)
    println(sampleBuffer)
}