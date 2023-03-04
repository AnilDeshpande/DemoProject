package com.demo.coroutinesdemo

import kotlinx.coroutines.async
import  kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun longRunningWork(coroutineName: String, delay: Long) {
    println("${coroutineName} Started")
    for( i in 0..9){
       delay(delay)
       println("Remaining time left for ${coroutineName}: " + (10 - i))
    }
    println("${coroutineName} ended")
}

 fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
    async { longRunningWork("Sample Coroutine", 1000) }
    println("Main ended")
}
