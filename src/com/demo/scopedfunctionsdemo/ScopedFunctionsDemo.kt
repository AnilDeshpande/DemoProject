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
    var letVaraible: Person?  = null //Person("James","Blend","UK",15)
    letVaraible?.let {
            currentPerson -> currentPerson?.nationality+currentPerson?.age
    }
    println("Let: $letVaraible")



    //run
    var runVariable: Person?  =  null // Person("James","Blend","UK",15)
    runVariable?.run {
        return@run this.nationality+this.age
    }
    println("Run: $runVariable")

    //with

    var seconVariable: Person? = null
    var withVariable  = with(Person("James","Blend","UK",15)) {
        return@with this.nationality+this.age
    }
    println("With: $withVariable")


    //
    var applyVariable: Person?  = null//Person("James","Blend","UK",15)
    applyVariable?.apply {
        //return@apply this.lastName - This is a error
        this?.firstName = firstName.reversed()
        nationality = "USA"
    }
    println("Apply: $applyVariable")

    var alsoVariable: Person?  = null //Person("James","Blend","UK",15)
    alsoVariable?.also {
//        return@also it.nationality - This is a error
            currentPerson ->
        currentPerson.firstName = currentPerson.firstName.reversed()
        currentPerson.nationality = "USA"
    }
    println("Also: $alsoVariable")


}



