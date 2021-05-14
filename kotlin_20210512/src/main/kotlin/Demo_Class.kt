import class_test.*

fun main(args : Array<String>) {
    val obj = MyClass() // create obj object of myClass class
    obj.printMe()
    println()

    println("------------------------")
    val demo = Class_Nested.Nested().foo() // calling nested class method
    println(demo)

    println("------------------------")
    val demo_ = Class_Inner().Nested().foo() // calling nested class method
    println(demo_)
}