package b_ocp.with_ocp

import b_ocp.Payment

fun main() {
    val paymentProcessor = PaymentProcessor()

    val ccPayment = Payment(
        id = "01",
        type = "credit_card",
        amount = 1999.toDouble()
    )
    val ccPaymentMethod = CreditCardPaymentMethod(ccPayment)
    paymentProcessor.process(ccPaymentMethod)


    val nbPayment = Payment(
        id = "02",
        type = "net_banking",
        amount = 2999.toDouble()
    )
    val netBankingPaymentMethod = NetBankingPaymentMethod(nbPayment)
    paymentProcessor.process(netBankingPaymentMethod)
}