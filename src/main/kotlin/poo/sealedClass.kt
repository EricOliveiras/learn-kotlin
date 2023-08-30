package poo

sealed class Mammal(val name: String)

class Cat(catName: String): Mammal(catName)
class Human(humanName: String, val job: String): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

fun main() {
    val cat = Cat("Snowy")
    val human = Human("Eric", "Software Developer")

    println(greetMammal(cat))
    println(greetMammal(human))
}
