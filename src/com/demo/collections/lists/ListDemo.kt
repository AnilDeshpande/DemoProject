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
    people.groupBy { it.firstName.get(0) }.forEach { println("${it.key}'s count ${it.value.count()}") }

    println(people.groupingBy { it.firstName.get(0) }.eachCount())

    val sample: MutableMap<Char, Int> = mutableMapOf()
    people.groupingBy { it.firstName.get(0) }.eachCountTo(sample)
    println(sample)

    // Transforming the existing list in to a Map
    val transformedGroupBy = people.groupBy(keySelector = {it.firstName+it.age}, valueTransform = {it.firstName +" "+" "+it.lastName})
    transformedGroupBy.forEach { key, value -> println("$key -> $value") }
}