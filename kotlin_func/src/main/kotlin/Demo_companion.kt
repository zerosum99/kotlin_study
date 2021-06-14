import object_companion.*

fun main() {
    val m = MyClass()
    println("Companion call ${MyClass.Companion.prop}")
    println("Companion call ${MyClass.Companion.method()}")
    println(" call ${MyClass.prop}")
    println(" call ${MyClass.method()}")

    // 객체로 호출할 때는 에러
    //println(m.prop)

    val comp1 = MyClass.Companion  //--(1)
    println(comp1.prop)
    println(comp1.method())
    val comp2 = MyClass            //--(2)
    println(comp2.prop)
    println(comp2.method())

    val comp11 = MyClass1.MyCompanion // -- (3)
    println(comp11.prop)
    println(comp11.method())
    val comp12 = MyClass1 // -- (4)
    println(comp12.prop)

    val comp14:MyClass1.MyCompanion = MyClass1
    println(comp14.prop)
    println(comp14.method())

    val comp21:MyClass2.MyCompanion1 = MyClass2
    println(comp21.prop1)
    println(comp21.method1())

    val compI1 = MyInterface.Companion
    println(compI1.prop)
    println(compI1.method())

}