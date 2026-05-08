package week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> = items
    fun searchByName(query: String): List<T> {
        return items.filter { item ->
            item.toString().contains(query, ignoreCase = true)
        }
    }
}