package com.demo.sealedclassesdemo

sealed class Student {
}

class UnderGraduateStudent: Student()

class PostGraduateStudent: Student()

class Doctorate: Student()

class PostDoctorateStudent: Student()