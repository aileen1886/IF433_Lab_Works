package week09

// Data class untuk menyimpan log perdagangan
data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
) [cite: 138, 139]