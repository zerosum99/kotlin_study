package class_pure

class Method_overload {

    fun get() {
        println(" method  call ")
    }
    inline fun get(func : (Int,Int) -> Int ) {
        println(func(10,10))
    }
}