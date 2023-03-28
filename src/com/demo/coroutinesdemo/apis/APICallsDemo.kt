package com.demo.coroutinesdemo.apis

import com.demo.collections.lists.Person
import kotlinx.coroutines.*

fun main(array: Array<String>) = runBlocking {

    val apiCalls: APICalls = MockAPICalls()

    println("Main Started")

     launch {
        apiCalls.registerUser(Person("SampleFirstName","SampleLastName","SampleNationality",30)).let {
            println(it)
        }
    }.join()

    launch {
        apiCalls.getAllUsers().let {
            println(it)
        }
    }

    println("Main Ended")
}