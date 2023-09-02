package exceptions

class IllegalVoteException(message: String): Throwable(message)

@Throws(IllegalVoteException::class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVoteException("$name não pode votar.")
    }
    println("$name, seu voto foi realizado com sucesso!")
}

fun main() {
    vote("Joe", 35)
    vote("Martin", 15)
}