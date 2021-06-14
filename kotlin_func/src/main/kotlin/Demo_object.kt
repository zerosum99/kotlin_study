import object_singleton.*
import class_inherit.*

fun main() {
    val obj = object {
        val property = " 속성 지정"
        fun method() : Int {
            println(" 오브젝트 표현식")
            return 42
        }
    }

    println("${obj.property} ${obj.method()} ")

    val out = Outer()
    //println(out.internal.property) 익명 오브젝트는 객체에서 참조 불가
    println(Outer.property)

    println(Outer.Test.property)
    // println(out.Test.property) 이름있는 오브젝트도 객체에서는 참조 불가

    val cup = Cupcake("아몬드")
    Oven.process(cup)

    ElectricOven.process(cup)

    println(Cupcake.almond())
    println(Cupcake.cheese())

    val factory : Cupcake.Companion = Cupcake.Companion
    println(factory.cheese())


}