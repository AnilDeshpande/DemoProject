package com.demo.lambademo




fun main(args: Array<String>){
    val num1 = 10;
    val num2 = 20;

    val add = {a:Int,b:Int -> a+b}

    val square: (Int) -> Int = { it * it }

    val cube : (Int)->Int = { it * it * it }

    //usage of it, single argument notation short hand
    //println("Sqaure of $num2 is ${square(num2)}")
    //println("cube of $num2 is ${cube(num2)}")


    // Lambdas as Class extensions, usage of this
    val lambdaAbbreviate: String.()->String = {
        val splitStrings = this.split(" "," ",ignoreCase = true)
        var abbrevation: StringBuilder? = StringBuilder("")
        for(word in splitStrings){
            abbrevation?.append(word[0])
        }
        abbrevation.toString().uppercase()
    }

    val fullName = "Anil Vasant Deshpande"
    //println("${fullName.lambdaAbbreviate()}")

    val lambdaAgeDescription: (Int)->String = description@ {age: Int ->
        if (age<13) return@description "Child"
        else if (age in 13..19) return@description "Teenage"
        else if (age in 20..60) return@description "Adult"
        else return@description "Senior Citizen"
    }

    println("${lambdaAgeDescription(10)}")


    //Ignoring paramters
    val sampleLambda: (String, String, String) -> Unit = { fName,_, lName-> println("${lName}, ${fName}") }
    sampleLambda("Anil","Vasant", "Deshpande")



}


fun ageDescription(age: Int): String{
        if (age<13) return "Child"
        else if (age in 13..19) return "Teenage"
        else if (age in 20..60) return "Adult"
        else return "Senior Citizen"
}