package com.demo.classes

open class Person{

    var firstName: String? = null
    set(value) {
        field = value?.toUpperCase()
    }

    get() {
        return field
    }

    var lastName: String? = null
    set(value) {
        field = value?.toUpperCase()
    }

    get() {
        return field
    }

    var age: Int? = null

    fun sampleFunction(){
        this.firstName
    }

    constructor(){

    }

    constructor(fName: String, lName: String): this(){
        firstName = fName
        lastName = lName
    }

    fun displayPerson(): String{
        return "${this.firstName} ${this.lastName}"
    }

    fun displayPerson(param: String): Int{
        return 10
    }

    fun demoFunction(param1: String ,
                     param2: String = "Some default value"){
        println("${param1}, ${param2}")
    }

    //Expression Function
    fun isMinor(): Boolean = this.age?.compareTo(18)!!<0

}







