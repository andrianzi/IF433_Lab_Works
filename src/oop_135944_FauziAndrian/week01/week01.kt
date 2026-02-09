package oop_135944_FauziAndrian.week01

fun main() {
    val name: String = "john thor"
    val score: Int = 80

    // Concentanation gaya lama
    println("Nama: $name, Nilai: $score")

    // Tambahkan di bawah println
    val grade = when (score) {
        in 90 ≤ .. ≤ 100 -> "A"
        in 80 ≤ .. ≤ 89 -> "B"
        in 70 ≤ .. ≤ 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

}