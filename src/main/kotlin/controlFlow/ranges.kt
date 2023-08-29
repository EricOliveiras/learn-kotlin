package controlFlow

fun main() {
    for (i in 0..5) {
        print("$i ")
        // output: 0 1 2 3 4 5
    }
    println()

    for (i in 0..< 5) { // can be use -> until - for (i in 0 until 5) {}
        print("$i ")
        // output: 0 1 2 3 4
    }
    println()

    for (i in 2..10 step 2) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 'a'..'e') {
        print("$i ")
    }
    println()

    for (i in 'z' downTo 'a' step 2) {
        print("$i ")
    }
    println()

    val x = 2
    if (x in (1..5)) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in (6..10)) {
        print("x is not in range from 6 to 10")
    }
}