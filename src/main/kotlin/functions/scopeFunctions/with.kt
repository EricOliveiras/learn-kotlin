package functions.scopeFunctions

class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 3000)

    with(configuration) {
        println("$host:$port")
    }

    configuration.run {
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")
}
