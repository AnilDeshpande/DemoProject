package com.demo.coroutinesdemo

import kotlinx.coroutines.*

suspend fun longRunningWork(coroutineName: String, delay: Long) {
    println("Worker Thread Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: ${Thread.currentThread().id} in ${coroutineName}" )
    for( i in 0..9){
       delay(delay)
//        println("Remaining time left for ${coroutineName} running on ${Thread.currentThread().name} thread is ${(10- i)}")
        withContext(Dispatchers.Default){
            println("Remaining time left for ${coroutineName} running on ${Thread.currentThread().name} thread is ${(10- i)}")
        }
    }
    println("${coroutineName} Thread ended")
}

 fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
     async { longRunningWork("CoRoutine1", 500) }
    println("Main ended")
}
