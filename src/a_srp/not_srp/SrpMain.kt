package a_srp.not_srp

import a_srp.Person

fun main() {
    val person = Person(
        name = "Devesh",
        age = 30
    )

    ValidatePerson(person).apply {
        displayPersonName()
        displayPersonAge()
    }
}