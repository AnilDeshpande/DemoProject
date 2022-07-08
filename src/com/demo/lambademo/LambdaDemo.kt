package com.demo.lambademo


fun main(args: Array<String>){
    val num1 = 10;
    val num2 = 20;

    val add = {a:Int,b:Int -> a+b}

    val square: (Int) -> Int = { it * it }

    val cube : (Int)->Int = {it*it*it}

    //usage of it, single argument notation short hand
    println("Sqaure of $num2 is ${square(num2)}")
    println("cube of $num2 is ${cube(num2)}")


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
    println("${fullName.lambdaAbbreviate()}")

}