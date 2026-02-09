package oop_135944_FauziAndrian.week01

fun main() {
    val gameTitle = "Bus Simulator"
    val price = 50000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("Game: $gameTitle")
    println("Final Price: Rp$finalPrice")
}

fun calculateDiscount(price: Int) = if (price > 500000) 100000 else 0
