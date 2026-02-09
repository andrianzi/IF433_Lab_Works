package oop_135944_FauziAndrian.week01

fun main() {
    val gameTitle = "Bus Simulator"
    val price = 50000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val userNote: String? = null

    println("Game: $gameTitle")
    println("Final Price: $finalPrice")
    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)

}

fun calculateDiscount(price: Int) = if (price > 500000) 100000 else 0

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Game: $title")
    println("Final Price: $finalPrice")
    println("Note: ${note ?: "Tidak ada catatan"}")
}
