package oop_135944_FauziAndrian.week02.week03

class Player(val username: String) {

    private var xp = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) return

        val oldLevel = level
        xp += amount

        if (level > oldLevel) {
            println("Selamat $username naik ke level $level!")
        }
    }
}