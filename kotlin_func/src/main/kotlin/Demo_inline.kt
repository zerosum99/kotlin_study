import class_pure.*

fun main() {
    val a = Inline()
    a.get()
    a.get {x:Int, y:Int -> x+y}

    val m = Method_overload()
    m.get()
    m.get {x:Int, y:Int -> x+y}
}

inline fun Inline.get(func : (Int,Int) -> Int ) {
    println(func(10,10))
}