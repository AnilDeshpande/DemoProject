package com.demo.learningextentions

import com.demo.classes.sentenceReverser

class University{
    fun foo(){
        print("foo")
    }
}

fun University.foo(){
    print("foo extension")
}

fun main(args: Array<String>){
    val sampleString = "I am working on this"
    //print(sampleString.sentenceReverser())

    val university = University()
    university.foo()
}

