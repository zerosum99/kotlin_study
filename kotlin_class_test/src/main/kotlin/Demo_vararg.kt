import utility.*

fun main(args: Array<String>) {
    val cc = createCollection(1,2,3,4)
    println(cc)

    val numbers = intArrayOf(2, 3, 4)
    val result = sum(*numbers)
    println(result)
}

fun sum(vararg data:Int) : Int {
    return   data.sum()
}