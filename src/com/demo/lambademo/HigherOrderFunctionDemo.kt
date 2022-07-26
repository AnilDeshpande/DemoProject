package com.demo.lambademo

import com.demo.enumsdemo.CoffeeCupSize
import com.demo.enumsdemo.Order

fun priceCalculator(coffeeCupSize: CoffeeCupSize):(Order)->Float{
    when(coffeeCupSize){
        CoffeeCupSize.SMALL -> return { order -> order.count * 1.0f }
        CoffeeCupSize.MEDIUM -> return { order -> order.count * 1.5f }
        CoffeeCupSize.LARGE -> return { order -> order.count * 2.5f }
        CoffeeCupSize.MEGA -> return { order -> order.count * 3.5f }
    }
}

fun main(args: Array<String>) {
    val orders = listOf(
        Pair(CoffeeCupSize.MEDIUM,Order(1)),
        Pair(CoffeeCupSize.MEGA,Order(1)),
        Pair(CoffeeCupSize.SMALL,Order(2)),
        Pair(CoffeeCupSize.LARGE,Order(1))
    )

    println("The cost of order is : ${getTotalOrderCost(orders)}")
}

fun getTotalOrderCost(orders: List<Pair<CoffeeCupSize, Order>>): Float {
    var sum = 0f
    orders.forEach { priceCalculator(it.first).invoke(it.second).also { sum += it } }
    return sum
}