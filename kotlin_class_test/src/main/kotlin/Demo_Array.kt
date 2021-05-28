fun main(args : Array<String>) {

    val a = add(1,2,3,4,5)
    println("add " +a)

    val b  = intArrayOf(1,2,3,4,5)    // 가변인자로 전달할 때는 array 로 처리해야함
    println(add(*b))                  // 배열을 언팩해서 함수에 인자로 전달하면 가변인자로 처리됨

    val c = IntArray(5) {i -> i}
    println(add(*c))

    val d = Array<Int>(5, {i->i}).toIntArray()  // Array<Int>를 Int Array로 변경해야함
    println(add(*d))

    val e = listOf(1,2,3,4,5).toIntArray()
    println(add(*e))
}

fun add(vararg x : Int) : Int {
    println(x.javaClass.name)   // vararg 가변 매개변수는 자바의 Array 타입
    return x.sum()
}