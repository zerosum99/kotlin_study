fun main(args : Array<String>) {
    val a = listOf(1,2,3,4)
    println(a.size)
    println(a.length())
    println(length_(a))
    println(a.product())
    println(product_(a))
    println(triple(a))
}

fun <T> List<T>.length() = this.size
fun <T> length_(list: List<T>) = list.size // 확장함수와 이름이 동일할 때 컴파일 에러를 발생시킴

fun List<Int>.product() : Int = this.fold(1) {a,b -> a *b }

fun product_(x:List<Int>) : Int = x.fold(1) {a, b -> a * b}
                // fun product(x: List<Int>): Int defined in root package
                //fun List<Int>.product(): Int defined in root package

fun triple(list: List<Int>) :List<Int> = list.map { x -> x *3}