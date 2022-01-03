package com.demo.valueclassdemo

@JvmInline
value class TimePeriod private constructor (
    val timePeriod: Long
) {
    companion object {

        fun millis(millis: Long) = TimePeriod(millis)

        fun seconds(seconds: Long) = TimePeriod(seconds * 1000)
    }
}

fun displayTimePeriod(message: String, duration: TimePeriod) {
    println("Will show $message for ${duration.timePeriod} milliseconds")
    println("Hashcode of the time period ${duration.hashCode()}")
}

fun main(array: Array<String>){

    displayTimePeriod("Displaying time period", TimePeriod.millis(2000))
    displayTimePeriod("Displaying time period", TimePeriod.seconds(2))
}