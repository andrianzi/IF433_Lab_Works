package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week05

class Admin (nama: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di didepan komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi.")
    }
}