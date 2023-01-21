package com.demo.collections.lists

import com.demo.inhertancedemo.*


@OptIn(ExperimentalStdlibApi::class)
fun main(array: Array<String>){
    // Sample Lists
    var people = listOf<Person>(
        Person("Anil","Deshpande","Indian",40),
        Person("Amit","Behl","Indian",26),
        Person("George","Orwel","UK",50),
        Person("Hazel","Keech","UK",26),
        Person("Anees","Khan","Pakistan",30),
        Person("James","Blend","UK",15),
    )

//    groupBy
    println("Group by first letter of the alphabet: ")
    people.groupBy { it.firstName.get(0) }.forEach { println("${it.key}'s  ${it.value}") }
    println(people.groupingBy { it.firstName.get(0) }.eachCount())

    println("Group people by nationality")
    val groupByNationality = people.groupBy { it.nationality }
    println(groupByNationality)
    println(people.groupingBy { it.nationality }.eachCount())

    println("Group people as age")
    people.groupBy { it.age < 18 }.forEach{ println("${it.key} -> ${it.value}")}
    println(people.groupingBy { it.age < 18 }.eachCount())



    // Transforming the existing list in to a Map

    val transformedGroupBy = people.groupBy(keySelector = {it.firstName+it.age}, valueTransform = {it.firstName +" "+" "+it.lastName})
    transformedGroupBy.forEach { key, value -> println("$key -> $value") }

    val ageTranformgroup = people.groupBy (keySelector = {if (it.age<18) "Minor" else "Major"}, valueTransform = {it})
    println(ageTranformgroup)


    val sample: MutableMap<Char, Int> = mutableMapOf()
    people.groupingBy { it.firstName.get(0) }.eachCountTo(sample)
    println(sample)

    //fold
    println("Sum of all ages : ${people.fold(0){acc: Int, person: Person -> acc + person.age}}")
    println("String formed  by first letter of first name of all : ${people.fold(""){acc: String, person: Person -> acc+""+person.firstName.get(0)}}")

    //reduce
    val numberList = listOf<Int>(1,2,4,5,6,43,33,54,23,12,5,67,87,56)
    println("Sum of numbers: ${numberList.reduce { acc, number -> acc + number }}")

    //aggregate - min, max, average, sum, count
    
}