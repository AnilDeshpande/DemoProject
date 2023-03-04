package com.demo.coroutinesdemo

import kotlinx.coroutines.async
import  kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun longRunningWork(coroutineName: String, delay: Long) {
    println("Worker Thread Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: ${Thread.currentThread().id} in ${coroutineName}" )
    for( i in 0..9){
       delay(delay)
        println("Remaining time left for ${Thread.currentThread().name}: " + (10 - i) +" in "+coroutineName)
    }
    println("Worker Thread ended")
}

 fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
     async { longRunningWork("CoRoutine 1", 30) }
    println("Main ended")
}
