package oop_135944_FauziAndrian.week07

fun processEvent(event: BattleState) {

    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name (Damage: $damage, Rarity: $rarity)")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        is BattleState.SafeZone -> {
            println("Kamu berada di zona aman")
        }
    }
}