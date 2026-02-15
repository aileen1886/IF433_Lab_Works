package ` oop_111362_Helen`.week01


fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val finalPrice = calculateDiscount(price)


    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun printReceipt(title: String, finalPrice: Int) {
    println("--- Struk GameStore ---")
    println("Judul: $title")
    println("Harga Akhir: Rp $finalPrice")
}