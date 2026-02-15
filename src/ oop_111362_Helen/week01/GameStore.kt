package ` oop_111362_Helen`.week01


fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()