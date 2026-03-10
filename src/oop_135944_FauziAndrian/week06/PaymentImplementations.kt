package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("processing Rp$amount via Gopay server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("contacting bank for Rp$amount")
    }
}