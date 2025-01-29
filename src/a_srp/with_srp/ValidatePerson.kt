package a_srp.with_srp

import a_srp.Person

class ValidatePerson(private val person: Person) {

    fun validatePersonName() = (person.name?.length ?: 0) > 3

    fun validatePersonAge() = (person.age ?: 0) > 18
}