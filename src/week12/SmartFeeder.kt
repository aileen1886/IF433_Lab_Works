package week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    // Validasi porsi harus > 0
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    // Placeholder return (akan diupdate di step berikutnya)
    return availableGram
}
