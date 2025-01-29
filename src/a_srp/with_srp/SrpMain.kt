package a_srp.with_srp

import a_srp.Person

fun main() {
    val person = Person(
        name = "Devesh",
        age = 30
    )

    with(person) {
        val validatePerson = ValidatePerson(this)

        DisplayPerson(this).apply {
            displayPersonName(validatePerson.validatePersonName())

            displayPersonAge(validatePerson.validatePersonAge())
        }
    }
}