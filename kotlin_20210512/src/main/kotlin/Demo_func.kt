import function.*
import func.*


fun main(args : Array<String>) {
    println(max(1,2))
    println(max_(1,2))

    println(" val " + yyy)
    println(" val " + answer)

    val ll = listOf(1,2,3)
    println(joinToString<Int>(ll,";","(", ")"))

    performOperation()
    println("----------------------------")

    println("Kotlin".lastChar())
    println("Kotlin".lastChar_())
    println("Kotlin".lastCharC())

    println("----------------------------")
    println(listOf(1,2,3,4).joinToString(":","(", ")"))
}