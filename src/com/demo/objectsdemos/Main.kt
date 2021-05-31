package com.demo.objectsdemos

interface Hybrid{
    fun fuelCombination()
}

abstract class Vehicle() {
    val numOfWheels: Int = 4
    abstract fun runsOn()

    companion object {
        fun getVehicle() : Vehicle{
            return object: Vehicle(), Hybrid {
                override fun runsOn() {
                    println("runs on electricity ${numOfWheels}")
                }

                override fun fuelCombination() {
                    print("Electricity and biofuel")
                }

                fun oneMoreFunctionality(){

                }
            }
        }
        val TAG : String = "Vehicle"
    }

}

fun main(array: Array<String>) {
    val sampleVehicle = Vehicle.getVehicle()
    Vehicle.TAG

    println(sampleVehicle is Any)
    sampleVehicle.runsOn()

}
