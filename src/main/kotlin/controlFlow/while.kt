package controlFlow

fun eatACake() = println("Eat a cake")
fun bakeACake() = println("Bake a cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}