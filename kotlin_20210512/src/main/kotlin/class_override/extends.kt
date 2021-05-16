package class_override

fun View.showOff() = println("I'm a view ")
fun Button.showOff() = println("I'm a button")

val String.lastChar : Char
    get() = get(length -1)