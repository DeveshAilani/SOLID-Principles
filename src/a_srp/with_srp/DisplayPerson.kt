package a_srp.with_srp

import a_srp.Person

class DisplayPerson(private val person: Person) {

    fun displayPersonName(isValid: Boolean) {
        if (isValid) {
            println(person.name)
        } else {
            println("Invalid Name")
        }
    }

    fun displayPersonAge(isValid: Boolean) {
        if (isValid) {
            println(person.age)
        } else {
            println("Invalid Age")
        }
    }
}