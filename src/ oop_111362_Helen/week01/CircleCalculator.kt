package ` oop_111362_Helen`.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius
    // Panggil fungsi di dalam println
    println("Radius: $radius, Area: $area, Status: ${checkSize(area)}")
}

// Refactor ke Expression Body
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"