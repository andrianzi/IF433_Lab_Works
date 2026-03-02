package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week04

import oop_135944_FauziAndrian.week04.Vehicle

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka. ")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}