package `111362_Helen_Week 7`

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }
        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Excalibur Lite", 99, ItemRarity.EPIC), 100)
        }
    }

    fun display() = "Weapon: ${item.name}, Dmg: ${item.damage}, Rarity: ${item.rarity}, Durability: $durability"
}