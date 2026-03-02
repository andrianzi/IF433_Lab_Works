package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week04

open class ElectricCar(val brand: String, val batteryCapacity: Int) {


    final fun accelerate() {
        println("$brand sedang berakselerasi dengan tenaga listrik")
    }

    open fun honk() {
        println("$brand berbunyi: Tiiinnn!")
    }
}