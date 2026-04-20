package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week08

package oop_001_johnthor.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    println("=== STARTING BATCH PROCESSING ===\n")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                parser.checkout(it)
                println("-----------------------------------")
            } ?: println("LOG: Skipping item - Tipe produk tidak dikenal atau null.\n")

        } catch (e: IllegalArgumentException) {
            println("ERROR LOG: Data korup ditemukan! Pesan: ${e.message}")
            println("Data sumber: $raw\n")
        }
    }

    println("=== BATCH PROCESSING FINISHED ===")
}