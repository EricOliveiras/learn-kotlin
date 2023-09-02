package exceptions

import kotlin.ArithmeticException

fun main() {
    val a = 10
    val b = 0

    try {
        val div = a / b
        println("$a / $b = $div")
    } catch (e: ArithmeticException) {
        e.printStackTrace()
    } finally {
        println("Finally ...")
    }

    val divisor = try { a / b } catch (e: ArithmeticException ) { 0 }
    println(divisor)
}
