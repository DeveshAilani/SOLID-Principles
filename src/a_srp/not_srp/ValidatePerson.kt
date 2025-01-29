package a_srp.not_srp

import a_srp.Person

class ValidatePerson(private val person: Person) {

    private fun validatePersonName() = (person.name?.length ?: 0) > 3

    private fun validatePersonAge() = (person.age ?: 0) > 18

    fun displayPersonName() {
        if (validatePersonName()) {
            println(person.name)
        } else {
            println("Invalid Name")
        }
    }

    fun displayPersonAge() {
        if (validatePersonAge()) {
            println(person.age)
        } else {
            println("Invalid Age")
        }
    }
}