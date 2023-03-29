package com.demo.coroutinesdemo.apis

import com.demo.collections.lists.Person
import kotlinx.coroutines.delay

class MockAPICalls: APICalls {

    // Sample Lists
    var people = mutableListOf<Person>()

    override suspend fun registerUser(person: Person): Response {
        delay(1000)
        people.add(person)
        return Response(200, "User Successfully registered", null)
    }

    override suspend fun getAllUsers(): Response {
        delay(1000)
        return Response(
            200,
            "All Registered Users",
            people
        )
    }
}