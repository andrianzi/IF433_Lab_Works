package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week04

import oop_135944_FauziAndrian.week04.Vehicle
/*
fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle( brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car( brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}

 */

fun main() {

    val car = ElectricCar("Tesla", 100)

    car.accelerate()
    car.honk()
    car.openTrunk()
}