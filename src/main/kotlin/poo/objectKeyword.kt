package poo

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("Input auth parameters = $username:$password")
    }
}

class BigBen {
    companion object Bonger {
        fun getBongers(nTimes: Int) {
            for (i in 1..nTimes) {
                println("BONG $i")
            }
        }
    }
}

fun main() {
    rentPrice(10, 2, 1)
    DoAuth.takeParams("myusername", "pass123")
    BigBen.getBongers(5)
}