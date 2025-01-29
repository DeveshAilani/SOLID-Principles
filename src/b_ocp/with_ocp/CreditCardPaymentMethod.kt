package b_ocp.with_ocp

import b_ocp.Payment

class CreditCardPaymentMethod(private val payment: Payment) : PaymentMethod{
    override fun processPayment(): Boolean {
        println("Making payment of ${payment.amount} using credit card")
        return true
    }
}