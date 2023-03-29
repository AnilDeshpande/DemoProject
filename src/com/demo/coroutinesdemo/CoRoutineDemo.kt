package com.demo.coroutinesdemo

import kotlinx.coroutines.*

suspend fun longRunningWork(coroutineName: String, delay: Long) {
    println("${coroutineName} Started")
    for( i in 0..9){
       delay(delay)
       println("Remaining time left for ${coroutineName}: " + (10 - i))
    }
    println("${coroutineName} ended")
}

suspend fun sampleSuspendFunction(coroutineName: String, delay: Long): String{
    println("${coroutineName} Started")
    delay(delay)
    println("${coroutineName} ended")
    return "Say hi from ${coroutineName}"
}

 fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
     var returnedValue = async {
        sampleSuspendFunction("SampleCoroutine",1000)
    }.await()
     println("Returned Value : ${returnedValue}")
    println("Main ended")
}
