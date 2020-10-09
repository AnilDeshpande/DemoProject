package com.demo.inhertancedemo

class Cat(override val animalType: String,
          override val petName: String, override val climberOf: String
): DomesticAnimal(animalType, petName), Cats {
    override fun makeSound() {
        println("${this.petName} makes purring sound, because it is a ${this.animalType}")
    }

    override fun climb() {
        println("$animalType climbs $climberOf")
    }


}