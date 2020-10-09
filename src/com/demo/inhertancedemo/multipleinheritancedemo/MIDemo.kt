package com.demo.inhertancedemo.multipleinheritancedemo

interface  A {
    fun foo()
}

interface B: A {
    override fun foo() {
        println("B")
    }
}

interface C: A {
    override fun foo() {
        println("C")
    }
}

class D: B, C{
    override fun foo() {
        super<B>.foo()
        super<C>.foo()
        println("D")
    }
}

fun main(args: Array<String>){
    val variable = D()
    variable.foo()
}