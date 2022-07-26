package com.demo.enumsdemo

enum class CoffeeCupSize (val quantity: Int) {
    MEGA(210){
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
     },
    LARGE(180) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    },
    MEDIUM(150) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    },
    SMALL(100) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    };

    abstract fun getInfo(): String;

}

class Order (var count: Int)

fun main(array: Array<String>){


}