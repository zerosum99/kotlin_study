import  class_test.*

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).printMe()                   // prints 10 :: accessing the printMe() method

    println("--------------------")

    val c = Derived(b)
    c.printMe()
}