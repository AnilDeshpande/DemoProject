package com.demo.coroutinesdemo.kotlinthreademo

internal class MyThread(private val threadName: String, val sleepDelay: Long) : Thread(threadName) {
    override fun run() {
        println("Worker Thread Started")
        println("Thread name: " + currentThread().name + ", Thread id: " + currentThread().id)
        for (i in 0..9) {
            try {
                sleep(sleepDelay)
                println("Remaining time left for ${Thread.currentThread().name}: " + (10 - i))
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
        println("Worker Thread ended")
    }
}

fun main(args: Array<String>) {
    println("Main started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
    for(i in 0..1000000) {
        MyThread(Thread.currentThread().name, 100*i.toLong()).start()
    }
    println("Main ended")
}