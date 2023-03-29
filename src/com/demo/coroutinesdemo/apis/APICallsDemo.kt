package com.demo.coroutinesdemo.apis

import com.demo.collections.lists.Person
import kotlinx.coroutines.*

fun main(array: Array<String>) = runBlocking {

    val apiCalls: APICalls = MockAPICalls()

    println("Main Started")
    launch {
        apiCalls.registerUser(Person("George","Hamlin","USA",34)).let { println(it) }
        apiCalls.registerUser(Person("Hannah","James","UK",50)).let { println(it) }
    }.join()

    val response = async {
        apiCalls.getAllUsers()
    }.await()

    println("The response is : ${response}")

    println("Main Ended")
}