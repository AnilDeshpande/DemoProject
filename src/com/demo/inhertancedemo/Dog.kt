package com.demo.inhertancedemo

class Dog(override val animalType: String, override val petName: String): DomesticAnimal(animalType, petName){
    override fun makeSound() {
        println("${this.petName} makes barking sound, because it is a ${this.animalType}")
    }
}