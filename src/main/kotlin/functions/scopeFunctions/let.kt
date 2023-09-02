package functions.scopeFunctions

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firsString ->
            strTwo?.let { secondString ->
                customPrint("$firsString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("first", "second")
}