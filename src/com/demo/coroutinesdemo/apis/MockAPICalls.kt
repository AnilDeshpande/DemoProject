package com.demo.coroutinesdemo.apis

import com.demo.collections.lists.Person
import kotlinx.coroutines.delay

class MockAPICalls: APICalls {

    // Sample Lists
    var people = listOf<Person>(
        Person("Anil","Deshpande","Indian",40),
        Person("Amit","Behl","Indian",26),
        Person("George","Orwel","UK",50),
        Person("Hazel","Keech","UK",26),
        Person("Anees","Khan","Pakistan",30),
        Person("James","Blend","UK",15),
    )

    override suspend fun registerUser(person: Person): Response {
        delay(1000)
        return Response(200, "User Successfully registered", null)
    }

    override suspend fun getAllUsers(): Response {
        delay(100)
        return Response(
            200,
            "All Registered Users",
            people
        )
    }
}