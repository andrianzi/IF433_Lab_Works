package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week06

class Smartwatch : Watch(), BluetoothConnectable ,Rechargeable {
    override fun showTime() {
        println("layar OLED menyala: 14.00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}