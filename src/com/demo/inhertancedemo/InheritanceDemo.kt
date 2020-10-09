package com.demo.inhertancedemo

fun main(args: Array<String>) {
    val animal: Animal = Tiger("Tiger","huge trees")
    animal.makeSound()
    (animal as Cats).climb()
}