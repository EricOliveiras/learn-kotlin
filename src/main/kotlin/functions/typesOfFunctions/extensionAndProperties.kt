package functions.typesOfFunctions

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull  { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
fun Order.minPricedItemValue(): Float = this.items.minByOrNull { it.price }?.price ?: 0F
fun Order.minPricedItemName() = this.items.minByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.joinToString { it.name }

// Generic
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun main() {
    val order = Order(listOf(
        Item("Bread", 25.0F),
        Item("Wine", 29.0F),
        Item("Water", 12.0F),
        Item("Milk", 8.0F)
    ))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Min priced item name: ${order.minPricedItemName()}")
    println("Min priced item value: ${order.minPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}