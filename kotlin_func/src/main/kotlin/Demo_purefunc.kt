import pure_func.*

fun main(args : Array<String>) {
    println(f(100))

    println(uppercase("hello world"))
    println(upper("hello world"))

    println(" transform call : " + transform("aaa", upper))
    println(" transform call : " + transform("bbbb", uppercase))
    println(" transform call : " + transform("ccc", {it.uppercase()}))

    println(" transform call : " + transform("dddd", ::aaa))

    var i = 0
    

    fun g(x:Long) : Long {
        return x +i
    }

    println(g(1))
    i++
    println(g(1))
    i++
    println(g(1))
}

fun aaa(x: String) : String {
    return x.uppercase()
}