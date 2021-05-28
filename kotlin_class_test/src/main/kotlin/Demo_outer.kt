import nested_inner_class.*

fun main(args : Array<String>) {
    val a = Outer()
    println(a.Inner().getOuterReference())

    println(Nested.Inner().getOuterReference())


}