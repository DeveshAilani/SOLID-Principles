package b_ocp.not_ocp

import b_ocp.Payment

fun main() {
    val paymentProcessor = PaymentProcessor()

    val payment1 = Payment(
        id = "01",
        type = "credit_card",
        amount = 199.toDouble()
    )
    paymentProcessor.processPayment(payment1)

    val payment2 = Payment(
        id = "02",
        type = "net_banking",
        amount = 299.toDouble()
    )
    paymentProcessor.processPayment(payment2)

    val payment3 = Payment(
        id = "03",
        type = "upi",
        amount = 499.toDouble()
    )
    paymentProcessor.processPayment(payment3)
}