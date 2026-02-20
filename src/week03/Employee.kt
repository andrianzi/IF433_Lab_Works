package oop_135944_FauziAndrian.week02.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}

private  var perfomanceRating: Int = 3

fun increasePerfomanceRating() {
    perfomanceRating++
    println("Kinerja $name meningkat! rating: $perfomanceRating")
}

fun printStatus() {
    println("karyawan: $name, Rating: $perfomanceRating")
}