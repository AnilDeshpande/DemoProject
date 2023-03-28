package com.demo.coroutinesdemo.apis

import com.demo.collections.lists.Person

interface APICalls {
    suspend fun registerUser( person: Person): Response
    suspend fun getAllUsers(): Response
}