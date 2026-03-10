package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("sistem operasi Smartphone berhasil booting.")
    }
}