package exceptions

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

data class Person(val name: String?)

fun main() {
    val person = Person(null)
    val s = person.name ?: fail("Name required")
    println(s)
    val x = null // Type Nothing?
}