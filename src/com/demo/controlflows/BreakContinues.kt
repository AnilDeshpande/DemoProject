package com.demo.controlflows

fun main(args: Array<String>) {
    /*outerloop@for(i in 1..3){
        innerloop@for(j in 1..3) {
            if(j==2) break@outerloop
            println("i: ${i}, j: ${j} \t")
        }
        println()
    }*/

    //return
    listOf(1,2,3,4,5,6).forEach sampl@{
        if(it==3) return@sampl
        println(it)
    }
}

