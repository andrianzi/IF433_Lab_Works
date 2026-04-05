package oop_135944_FauziAndrian.week07
object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected To Server"
        println("Database is ready.")
    }
}