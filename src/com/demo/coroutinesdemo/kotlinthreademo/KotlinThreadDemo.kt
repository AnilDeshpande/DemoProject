package com.demo.coroutinesdemo.kotlinthreademo

internal class MyThread : Thread() {
    override fun run() {
        println("Worker Thread Started")
        println("Thread name: " + currentThread().name + ", Thread id: " + currentThread().id)
        for (i in 0..9) {
            try {
                sleep(1000)
                println("Remaining time left: " + (10 - i))
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
    MyThread().start()
    println("Main ended")
}