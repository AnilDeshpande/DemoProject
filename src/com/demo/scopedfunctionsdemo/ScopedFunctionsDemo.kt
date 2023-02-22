package com.demo.scopedfunctionsdemo

import com.demo.collections.lists.Person


fun main(args: Array<String>){

    var people: List<Person>? = listOf<Person>(
        Person("Anil","Deshpande","Indian",40),
        Person("Amit","Behl","Indian",26),
        Person("George","Orwel","UK",50),
        Person("Hazel","Keech","UK",26),
        Person("Anees","Khan","Pakistan",30),
        Person("James","Blend","UK",15),
    )
    //let
    var letVaraible  = Person("James","Blend","UK",15).let {

    }
    println("Let: $letVaraible")



    //run
    var runVariable  = Person("James","Blend","UK",15).run {

    }
    println("Run: $runVariable")

    //with
    var withVariable  = with(Person("James","Blend","UK",15)) {

    }
    println("With: $withVariable")


    //
    var applyVariable  = Person("James","Blend","UK",15).apply {

    }
    println("Apply: $applyVariable")

    var alsoVariable  = Person("James","Blend","UK",15).also {

    }
    println("Also: $alsoVariable")


}



