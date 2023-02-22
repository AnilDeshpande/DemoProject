package com.demo.collections.lists

data class Person (val firstName: String, val lastName: String, var nationality: String?, var age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age.compareTo(other.age)
    }

    companion object {
        class FirstNameComparator: Comparator<Person>{
            override fun compare(o1: Person?, o2: Person?): Int {
                return o1!!.firstName.compareTo(o2!!.firstName)
            }
        }

        class LastNameComparator: Comparator<Person>{
            override fun compare(o1: Person?, o2: Person?): Int {
                return o1!!.lastName.compareTo(o2!!.lastName)
            }
        }

        class AgeComparator: Comparator<Person>{
            override fun compare(o1: Person?, o2: Person?): Int {
                return o1!!.age - o2!!.age
            }
        }

    }
}







