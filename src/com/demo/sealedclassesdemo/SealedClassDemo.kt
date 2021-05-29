package com.demo.sealedclassesdemo



fun main(array: Array<String>){

    val me: Student = Doctorate()

    when(me){
        is Doctorate -> print("Doctorate")
        is PostDoctorateStudent -> print("PostDoctorateStudent")
        is UnderGraduateStudent -> print("UnderGraduateStudent")
        is PostGraduateStudent -> print("PostDoctorateStudent")

    }

}