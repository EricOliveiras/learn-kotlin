class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "eric@email.com")
    println(contact.id)
    println(contact.email)
    contact.email = "eric2@email.com"
    println(contact.email)
}