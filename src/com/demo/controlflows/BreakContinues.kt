package com.demo.controlflows

fun main(args: Array<String>) {
    loop@ for(i in 1..10){
        if(i==5) continue@loop
        println(i)
    }
}