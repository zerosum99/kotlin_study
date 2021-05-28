fun main(args : Array<String>) {
    fun double(n : Int) : Int = n *2

    val dd = { n:Int -> n * 2}

    println(dd(10))

    val ddd = { n : Int -> double(n)}
    println(ddd(10))

    val xx : (Int) -> Int = {double(it)}
    println(xx(100))

    val yy = ::double   // 함수 참조
    println(yy(300))

    val foo = MyClass()
    val multi = foo::double  // 객체에서 메소드 참조는 
    println(multi(400))

    val multi2 = MyClass::double  // 클래스 내의 함수 참조하면 먼저 객체도 전달해줘야 함
    println(multi2(foo,500))
}

class MyClass {
    fun double(n:Int) : Int = n *2
}