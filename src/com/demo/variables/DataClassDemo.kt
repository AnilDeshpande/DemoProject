package com.demo.variables

data class Person(val firstName: String, val lastName: String){
    var gender:  String? = null
}

fun main(array: Array<String>){

    val me = Person("Anil", "Deshpande")
    me.gender = "Male"
    println(me)

    val copyOfMe = me.copy(lastName = "Kulkarni")
    val (fname,lname) = copyOfMe
    println("${fname} ${lname}")
}