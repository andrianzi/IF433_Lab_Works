package oop_135944_FauziAndrian.week02.week03
/*
fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerfomance()

    println("Pajak yang harus dibayar: ${e.salary}")
}
*/

fun main() {

    val weapon = Weapon("Excalibur")

    weapon.damage = -50      // gagal
    weapon.damage = 9999     // jadi 1000

    println("Nama: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}
