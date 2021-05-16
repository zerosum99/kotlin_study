import class_interface.*

fun main(args : Array<String>) {
    val b = Button()
    b.click()
    b.showOff()

    val t = TalkativeButton()
    t.giveSpeech()

    println("-------------")
    val o = Outer()
    println(o)

    println(Outer.Nested())
    println("nested class " + Outer.Nested().foo())

    println("inner class " + Outer2().Inner().foo())
}