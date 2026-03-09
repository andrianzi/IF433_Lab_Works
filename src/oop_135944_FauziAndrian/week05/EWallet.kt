package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week05


class EWallet(
    override val accountName: String,
    var balance: Double
) : PaymentMethod() {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName membayar $amount")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName top up $amount")
    }
}