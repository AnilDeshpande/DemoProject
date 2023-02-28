package com.demo.coroutinesdemo

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
    longRunningWork()
    println("Main ended")
}


fun longRunningWork() = runBlocking {
    println("Worker Thread started")
    launch {
        println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
        for( i in 1..10){
            delay(1000)
            println("Remaining time left: " + (10 - i))
        }
        println("Worker Thread ended")
    }
}