package b_ocp.with_ocp

import b_ocp.Payment

class NetBankingPaymentMethod(private val payment: Payment) : PaymentMethod {
    override fun processPayment(): Boolean {
        println("Making payment of ${payment.amount} using net banking")
        return true
    }
}