package com.demo.inhertancedemo

//Abstract classes
abstract class Animal {
    abstract val animalType: String
    abstract fun makeSound()
}

abstract class WildAnimal:Animal()

open class DomesticAnimal(override val animalType: String, open val petName: String): Animal(){
    override fun makeSound() {
        println("Make WildAnimal sound")
    }
}

class Tiger(override val animalType: String): WildAnimal(){
    override fun makeSound() {
        println("${this.animalType} makes roaring sound")
    }
}

class Dog(override val animalType: String, override val petName: String): DomesticAnimal(animalType, petName){
    override fun makeSound() {
        println("${this.petName} makes barking sound, because it is a ${this.animalType}")
    }
}

class Cat(override val animalType: String, override val petName: String): DomesticAnimal(animalType, petName){
    override fun makeSound() {
        println("${this.petName} makes purring sound, because it is a ${this.animalType}")
    }
}

fun main(args: Array<String>) {
    val animal: Animal = Dog("Dog", "Jimmy")
    animal.makeSound()
}