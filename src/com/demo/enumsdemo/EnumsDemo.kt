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

class Order (var orderSize: CoffeeCupSize)

fun main(array: Array<String>){

    val myOrder = Order(CoffeeCupSize.SMALL)
    println(myOrder.orderSize.getInfo())

    when(myOrder.orderSize){
        CoffeeCupSize.MEGA -> print("This is Mega")
        CoffeeCupSize.LARGE -> print("This is Mega")
        CoffeeCupSize.MEDIUM -> print("This is Mega")
        CoffeeCupSize.SMALL -> print("This is Mega")
    }




}