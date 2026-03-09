package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week05
/*
fun Main {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------")
    }
}

 */


fun main() {

    val wallet = EWallet("Fauzi", 100000.0)
    val creditCard = CreditCard("Fauzi", 2000000.0)

    val methods: List<PaymentMethod> = listOf(wallet, creditCard)

    for (method in methods) {

        when(method) {
            is EWallet -> println("Pembayaran menggunakan E-Wallet")
            is CreditCard -> println("Pembayaran menggunakan Credit Card")
        }

        // pembayaran pertama
        method.processPayment(150000.0)

        // SMART CASTING
        if (method is EWallet) {
            println("Top up otomatis 50000")
            method.topUp(50000.0)

            println("Mencoba pembayaran lagi...")
            method.processPayment(75000.0)
        }

        println("-------------------")
    }
}