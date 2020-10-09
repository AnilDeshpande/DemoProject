package com.demo.inhertancedemo

interface Cats : Climber {
    override fun climb() {
        println(" climbs $climberOf")
    }
}