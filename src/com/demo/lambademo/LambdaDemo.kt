package com.demo.lambademo

//fun add( num1: Int, num2: Int): Int{
//    return num1+num2;
//}

fun main(args: Array<String>){
    val num1 = 10;
    val num2 = 20;

    val add = {a:Int,b:Int -> a+b}

    println("${num1} + ${num2} = ${add.invoke(num1,num2)}")

    val square: (Int) -> Int = { it * it }


    //usage of it, single argument notation short hand
    println("Sqaure of $num2 is ${square(num2)}")


    // Lambdas as Class extensions, usage of this
    val abbreviate : String.()->String = {
        val splitStrings = this.split(" "," ",ignoreCase = true)
        var abbrevation: StringBuilder? = StringBuilder("")
        for(word in splitStrings){
            abbrevation?.append(word[0])
        }
        // This is no return statement, the final expression that gets evaluated is returned automatically
        abbrevation.toString().uppercase()
    }

    val fullName = "George Washington"
    println("${fullName.abbreviate()}")

}