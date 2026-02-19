package ` oop_111362_Helen`.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000


    val finalPrice = calculateDiscount(price)
    val userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}


fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        (price * 0.9).toInt()
    } else {
        price
    }
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("--- Struk GameStore ---")
    println("Judul: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}
