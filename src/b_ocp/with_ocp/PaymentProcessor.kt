package b_ocp.with_ocp

import b_ocp.Payment

class PaymentProcessor {
    fun process(paymentMethod: PaymentMethod): Boolean {
        return paymentMethod.processPayment()
    }
}