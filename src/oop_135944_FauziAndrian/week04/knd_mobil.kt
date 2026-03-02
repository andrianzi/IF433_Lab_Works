package oop_135944_FauziAndrian.week04

class knd_mobil: Kendaraan() {
    private var jmlBan: Int= 0;
    init {
        jmlBan = 4;
        println("Mobil punya $jmlBan ban")
    }

    override fun jalan_maju() {
        println("jalann !!!");
    }
}