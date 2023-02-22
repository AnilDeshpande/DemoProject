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
        return@let it.nationality+it.age
    }
    println("Let: $letVaraible")



    //run
    var runVariable  = Person("James","Blend","UK",15).run {
        return@run this.nationality+this.age
    }
    println("Run: $runVariable")

    //with
    var withVariable  = with(Person("James","Blend","UK",15)) {
        return@with this.nationality+this.age
    }
    println("With: $withVariable")


    //
    var applyVariable  = Person("James","Blend","UK",15).apply {
        //return@apply this.lastName - This is a error
        firstName = firstName.reversed()
        nationality = "USA"
    }
    println("Apply: $applyVariable")

    var alsoVariable  = Person("James","Blend","UK",15).also {
//        return@also it.nationality - This is a error
        it.firstName = it.firstName.reversed()
        it.nationality = "USA"
    }
    println("Also: $alsoVariable")


}



