package com.demo.variables

fun main(args: Array<String>) {
    var sample  = "Welcome to programming"

    var million1 = 10_00_000

    var million2: Int? = 1000_000

    println("Testing $million1 == $million1 ${million1==million2}")
    println("Testing $million1 === $million2 ${million1===million2}")
}