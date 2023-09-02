package functions.typesOfFunctions

fun main() {
    val uppercase1: (String) -> String = { str: String -> str.uppercase() }
    val uppercase2: (String) -> String = { str -> str.uppercase() }
    val uppercase3 = { str: String -> str.uppercase() }
    val uppercase4: (String) -> String = { it.uppercase() }
    val uppercase5: (String) -> String = String::uppercase

    println(uppercase1("Hello"))
    println(uppercase2("Hello"))
    println(uppercase3("Hello"))
    println(uppercase4("Hello"))
    println(uppercase5("Hello"))
}