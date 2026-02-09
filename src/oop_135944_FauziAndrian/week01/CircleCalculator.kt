package oop_001_johnthor.week01

fun main() {
    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius *radius

    // Output Cocetenation
    println("Radius: $radius, Area: $area")

    // Logic check
    println(checkSize(area))
}

fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"


