package com.demo.delegatesdemo

interface Engine {
    fun runsOn();
    fun getTransmissionType()
}

class ElectricEngine: Engine{
    override fun runsOn() {
        println("Runs on electricity")
    }

    override fun getTransmissionType() {
        println("No Manual transmission")
    }
}

class TeslaEngine (val engine: Engine): Engine by engine {
    override fun getTransmissionType() {
        println("Not applicable")
    }
}

fun main(array: Array<String>) {
    val  sampleEngine = TeslaEngine(ElectricEngine())
    sampleEngine.runsOn()
    sampleEngine.getTransmissionType()
}