fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
//    strLength(nullable) // error
    println(describeString(neverNull))
    println(describeString(nullable))
}

fun describeString(maybeString: String?): String {
    if(maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    }
    return "Empty or null string"
}