import class_override.*

fun main(args : Array<String>) {
    val view : View = Button()
    view.click()
    view.showOff()
    println("--------------------")
    val but : Button = Button()
    but.click()
    but.showOff()

    println("kotlin".lastChar)
    println("--------------------")
    val (a, b) = Pair(1, "x")
    println(a) // 1
    println(b) // x
}