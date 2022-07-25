package com.demo.lambademo

fun interface AgeDescriber {
    fun ageDescription(person: Person): Unit
}

class Person(val name: String, val age: Int)


fun ageDescriber(people: List<Person>, ageDescriber: AgeDescriber){
    people.forEach { ageDescriber.ageDescription(it) }
}

fun main(args: Array<String>) {
    val people = listOf<Person>(
        Person("Anil Deshpande",40),
        Person("Anika",9),
        Person("George",18)
    )
    //SAM Conversion
    ageDescriber(people) { person ->
        val ageDescriptor = if (person.age < 13) "Child"
        else if (person.age in 13..19) "Teenager"
        else if (person.age in 20..60) "Adult"
        else "Senior Citizen"

        println("${person.name} is $ageDescriptor as his age is ${person.age}")
    }
}