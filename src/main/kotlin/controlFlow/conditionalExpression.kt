package controlFlow

fun max(a: Int, b: Int) = if (a > b) a else b
fun bool(a: Int, b: Int) = a > b

fun main() {
    println(max(45, 21))
    println(max(5, 31))

    println(bool(5, 1))
    println(bool(2, 6))
}