package com.demo.coroutinesdemo

import kotlinx.coroutines.*

suspend fun longRunningWork(coroutineName: String, delay: Long) {
    println("Worker Thread Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: ${Thread.currentThread().id} in ${coroutineName}" )
    for( i in 0..9){
       delay(delay)
        withContext(Dispatchers.Default){
            println("Remaining time left for ${Thread.currentThread().name}: " + (10 - i) +" in "+coroutineName)
        }
    }
    println("${coroutineName} Thread ended")
}

 fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
     async { longRunningWork("CoRoutine1", 500) }
     async { longRunningWork("CoRoutine2", 400) }
    println("Main ended")
}
