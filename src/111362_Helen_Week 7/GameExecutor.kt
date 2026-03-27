package `111362_Helen_Week 7`

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Muncul monster ${event.monsterName}!")
        is BattleState.LootDropped -> {
            val (name, dmg, rarity) = event.item
            println("Horee! Dapat loot: $name (Dmg: $dmg, Rarity: $rarity)")
        }
        is BattleState.GameOver -> println("GAME OVER: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di area aman. Silakan beristirahat.")
    }
}