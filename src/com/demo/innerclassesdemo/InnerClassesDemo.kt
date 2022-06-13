package com.demo.innerclassesdemo

class Person(val name: String?,
             var address: Address?){
    inner class Address(val buildingNumber: String,
                  val streetName: String,
                  val locality: String,
                  val city: String,
                  val PIN: String){
        val contextName = name

        fun  displayAddress (){
            println(" ${this.contextName} resides at ${this.streetName}, ${locality}, ${city}")
        }
    }
}


fun main(array: Array<String>){
    val person = Person("Anil", null);
    val personAddress  = person.Address("231","Sample Street", "Sample Locality","Sample City","234234")
    person.address = person.Address("231","Sample Street", "Sample Locality","Sample City","234234")

    person.address?.displayAddress()




}

