package week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n--- Test Weapon Task (Checkpoint 8) ---")
    val w = Weapon("Keris")
    w.damage = -50
    w.damage = 9999

    println("Weapon: ${w.name}, Damage: ${w.damage}, Tier: ${w.tier}")
}