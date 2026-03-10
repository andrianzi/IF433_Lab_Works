package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.Latweek06

class KRS(override val nama: String, override val namaSiswa: String) : Mahasiswa, Siswa {
    override fun belajar() {
        println("$nama sedang belajar")
        println("siswa $namaSiswa sedang belajar juga")
    }

    override fun main_game() {
        super<Mahasiswa>.main_game()
    }

    override fun makan() {
        println("Mahasiswa Makan")
    }

    override fun mandi() {
        println("Siswa Mandi")
    }
}