import class_inheritace.*

fun main(args: Array<String>) {
    var  a = BCD()
    a.think()
    println()
    println("---------------------")
    val obj = InterfaceImp()
    println("My Variable Value is = ${obj.myVar}")
    print("Calling hello(): ")
    obj.hello()

    print("Message from the Website-- ")
    println(obj.absMethod())

    println("---------------------")
    val obj_ = multipleInterfaceExample()
    obj_.printMe()
    obj_.printMeToo()

}