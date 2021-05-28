import class_operator_overload.*

fun main(args : Array<String>) {
    val m1 = Score(2,3)
    val m2 = Score(5,5,)

    println(m1 + m2)

    val s1 = "Hello"
    val s2 = ", world"
    println(s1 + s2)

    println("-" * 20)

    println(s1 * 3)
}

operator fun String.times(i : Int) :String {
    var result : String = ""
    for (j in 1..i)  {
        result += this
    }
    return result
}