package com.demo.scopedfunctionsdemo

import com.demo.classes.Person

fun main(args: Array<String>){

    var ashwini = Person().let {
        it.firstName  = "Ashwini"
        it.age = 30
        it.lastName = "Joshi"
        println("The person is ${it.firstName} ${it.lastName} is ${it.age}")
    }


    var anil = Person().let {
        it.age = 40
        it.lastName = "Deshpande"
        it.firstName = "Anil"
        println("${it.firstName} ${it.lastName} is ${if (it.isMinor()) "minor" else "not minor"}")
    }



}