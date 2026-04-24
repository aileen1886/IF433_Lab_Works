package week09

fun main() {
    // Inisialisasi list minimal 6 data dengan campuran status dan ROE
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 25, -10.5, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 2.1, "OPEN"),
        TradeLog("DOGEUSDT", "SHORT", 5, -2.5, "CLOSED")
    )
}