package com.demo.coroutinesdemo

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun longRunningWork(coroutineName: String, delay: Long) {
    println("Worker Thread started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id +" in ${coroutineName} coroutine")
    for( i in 1..10){
        delay(delay)
        println("Remaining time left for ${coroutineName}: ${(10 - i)} in coroutine ${coroutineName}" )

    }
    println("Worker Thread ended")
}

 fun main()  = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
    async { longRunningWork("Routine 1",100) }
    println("Main ended")
}


