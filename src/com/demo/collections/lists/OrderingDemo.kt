package com.demo.collections.lists

fun main(args: Array<String>) {
    val sampleList1 = setOf<String>("Hubli","Bangalore","Hyderabad")
    val sampleList2 = setOf<String>("Hubli","Hyderabad","Bangalore")

//    println(sampleList1.equals(sampleList2))

    // Sample Lists
    var people = listOf<Person>(
        Person("Anil","Deshpande","Indian",40),
        Person("Amit","Behl","Indian",26),
        Person("George","Orwel","UK",50),
        Person("Hazel","Keech","UK",26),
        Person("Anees","Khan","Pakistan",30),
        Person("James","Blend","UK",15),
    )

    people.sortedDescending().forEach { println(it) }
//    people.toSortedSet(comparator = Person.Companion.AgeComparator()).forEach { println(it) }

//    people.sortedBy { it.age }.forEach { println(it) }
//    people.sortedBy { it.lastName }.forEach { println(it) }
//    people.sortedBy { it.firstName }.forEach { println(it) }



    val person1 = Person("Anil","Deshpande","Indian",40)
    val  person2 = Person("Anil","Deshpande","Indian",40)
//
//    println(person1 == person2)




}