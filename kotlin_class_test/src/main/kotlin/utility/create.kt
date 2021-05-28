package utility

fun createCollection(vararg x: Number) : List<Number> {
    println(x.javaClass)
    val ll = listOf(*x)
    return ll
}


