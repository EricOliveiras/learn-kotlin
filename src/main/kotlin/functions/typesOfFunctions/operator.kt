package functions.typesOfFunctions

fun main() {
    operator fun Int.times(string: String) = string.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val string = "Always forgive your elements; nothing annoys then o much."
    println(string[0..14])
}