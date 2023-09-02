package functions.scopeFunctions

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        setOfNotNull(
            ns?.run {
                println("\tis empty? ${isEmpty()}")
                println("\tlength = $length")
                length
            }
        )
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}