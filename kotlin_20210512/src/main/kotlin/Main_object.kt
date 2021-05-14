import object_test.*

fun main(args : Array<String>) {
    val a0 = Outer()
    Outer.InnerObject.printCount()
    val a1 = Outer()
    Outer.InnerObject.printCount()

    println("-------------------------")
    OuterClass.printMsg()

    val a = object : Outer() {
        fun call() {
            println(" annoymous object")
        }
    }

    a.call()
}