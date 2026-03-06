package week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar $amount Berhasil. Sisa limit: ${limit - usedAmount}")
        } else {
            println("[$accountName] Gagal: Transaksi ditolak karena melebihi limit.")
        }
    }
}