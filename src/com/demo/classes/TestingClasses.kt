package com.demo.classes


fun isEven(number: Int): Boolean = number%2==0

//Variable Arguments functions

fun sum(vararg numbers: Int, name: String ): Int{
    var sum = 0
    for(number in numbers){
        sum+= number
    }
    return sum
}


fun main(args: Array<String>){
    val person  = Person("Anil","Deshpnade")
    person.firstName = "anil"
    person.lastName = "deshpande"
    person.age = 15

    println(person.displayPerson("Param"))

    person.demoFunction(param1 = "Param1")

    println("${person.firstName} is ${person.isMinor()}")

    println(isEven(90))

    println("Sum: ${sum(1,2,3,4, name = "Anil")}")
}