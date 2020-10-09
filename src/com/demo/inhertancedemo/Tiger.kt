package com.demo.inhertancedemo

class Tiger(override val animalType: String, override val climberOf: String): WildAnimal(), Cats{
    override fun makeSound() {
        println("${this.animalType} makes roaring sound")
    }

    override fun climb() {
        println("$animalType climbs $climberOf")
    }
}