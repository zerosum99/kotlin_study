
fun main(args:Array<String>) {
    println({x:String -> x.uppercase()}("hello"))
    println({ x : Int -> {y:Int -> x +y } }(100)(200))

    println(func("hello", {x:String -> x.uppercase()}))
    println(func("hello", {x -> x.uppercase()}))
    println(func("hello", {it.uppercase()}))
    println(func("hello") {it.uppercase()})
}

fun <T> func(x: T, fn: (T) -> T) : T {
    return fn(x)
}