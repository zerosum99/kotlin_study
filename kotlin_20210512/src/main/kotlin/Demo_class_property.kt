import class_property.*

fun main(args : Array<String>) {
    val r = Ractangle(100,200)
    println(" is Square " + r.isSquare)
    val Ractangle = 100
    println(Ractangle)

    val rr = Ractangle(100,100)  // 필드와 동일한 이름이지만 충돌이 안남
    println(" Rantangel " + rr)

    val i = Identifier()
    println( " filed " + i.a)
    println(" method " + i.a())

    // class Ractangle(val x :Int )    // Kotlin: Conflicting declarations: val Ractangle: Int, local final class Ractangle
    // 로컬 클래스와 필드는 이름 충돌이 됨
}