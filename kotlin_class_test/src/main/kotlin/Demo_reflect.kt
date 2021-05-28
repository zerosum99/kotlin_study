fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    numbers.filter(::isOdd).forEach {
            println(it)
        }
    println("--------------------------------")
    numbers.filter({x -> isOdd(x)}).forEach { println(it)}

}

fun isOdd(x: Int): Boolean {
    return x % 2 != 0
}
