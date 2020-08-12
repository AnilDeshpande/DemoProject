package com.demo.variables

// Null Safety
fun main(args: Array<String>) {
    var sampleVar: Int? = 10
    sampleVar = null

    sampleVar = 32

    if (sampleVar!=null){
        println("We have a value ${sampleVar}")
    } else {
        println("We don't have the value")
    }

    var sampleString: String? = "23"
    sampleString = null
    val stringLength = sampleString?.length ?: "Unknown Length"
    println("The String length is ${stringLength}")

    sampleVar = sampleString as? Int

    val num1 = 12.12
    val num2: Float = num1.toFloat() // Works
    val num3: Double = num2.toDouble() // Exception



}
