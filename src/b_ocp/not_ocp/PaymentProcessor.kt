package b_ocp.not_ocp

import b_ocp.Payment

class PaymentProcessor {

    fun processPayment(payment: Payment) {
        when (payment.type) {
            "credit_card" -> {
                println("Making payment of ${payment.amount} using credit card")
            }

            "net_banking" -> {
                println("Making payment of ${payment.amount} using net banking")
            }

            else -> {
                println("Payment type not supported")
            }
        }
    }
}