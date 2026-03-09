package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week05

class CreditCard(
    override val accountName: String,
    private val creditLimit: Double
) : PaymentMethod() {

    private var usedAmount = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= creditLimit) {
            usedAmount += amount
            println("$accountName berhasil membayar Rp$amount dengan kartu kredit")
            println("Total penggunaan kartu: Rp$usedAmount")
        } else {
            println("Transaksi ditolak! Melebihi limit kartu kredit.")
        }
    }
}