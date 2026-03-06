package week5

fun main() {
    println("\n=== SISTEM PEMBAYARAN E-COMMERCE ===")

    val dompet = EWallet("John Thor", 50000.0)
    val kartu = CreditCard("John Thor", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(dompet, kartu)

    for (payment in paymentList) {
        println("-- Memproses metode: ${payment.accountName} --")

        payment.processPayment(75000.0)

        if (payment is EWallet && payment.balance < 75000.0) {
            println("=> Recovery: Saldo kurang, mencoba Top Up otomatis...")
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
        println()
    }

    val math = MathHelper()

    println("=== PENGUJIAN OVERLOADING ===")

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r 7): $luasLingkaran")

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
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }
}