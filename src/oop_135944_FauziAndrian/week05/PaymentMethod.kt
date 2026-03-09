package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week05

abstract class PaymentMethod {

    abstract val accountName: String
    abstract fun processPayment(amount: Double)

}