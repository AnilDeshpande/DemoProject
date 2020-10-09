package com.demo.inhertancedemo

open class DomesticAnimal(override val animalType: String, open val petName: String): Animal(){
    override fun makeSound() {
        println("Make WildAnimal sound")
    }
}