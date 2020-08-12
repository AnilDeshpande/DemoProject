package com.demo.inhertancedemo

open class Animal{
    open fun makeSound(){
        println("Make generic sound")
    }
}

open class WildAnimal:Animal(){
    override fun makeSound() {
        println("Make wild animal sound")
    }
}

open class DomesticAnimal: Animal(){
    override fun makeSound() {
        println("Make domestic animal sound")
    }
}

class Tiger: WildAnimal(){
    override fun makeSound() {
        println("Make roaring sound")
    }
}

class Dog: DomesticAnimal(){
    override fun makeSound() {
        println("Make barking sound")
    }
}

class Cat: DomesticAnimal(){
    override fun makeSound() {
        println("Make purring sound")
    }
}

fun main(args: Array<String>) {

    val animal: Animal = Tiger()
    animal.makeSound()

}