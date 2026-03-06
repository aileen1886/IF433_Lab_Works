package week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount Berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Gagal: Saldo tidak cukup untuk membayar $amount.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil Top Up sebesar $amount. Saldo sekarang: $balance")
    }
}