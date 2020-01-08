package com.demo.controlflows

fun main(args: Array<String>){
    var index = 0

    /*while (index < 0 ){
        println(index)
        index++
    }*/

    do {
        println(index)
        index++
    }while (index < 0)
}