
interface A {
    fun method() : String
}

interface B {
    fun method1() : String
    fun method2() : String
}

interface D {
    fun method() : String
    fun method1() : String
    fun method2() : String
}

class C : A, B, D {
    override fun method(): String {
        return "call A method"
    }
    override fun method1(): String {
        return "call B method1"
    }
    override fun method2(): String {
        return "call B method2"
    }

}

fun main() {
    val c:A = C()
    println(c.method())
    /* Kotlin: Unresolved reference: method1
    println(c.method1())
    */

    val cb : B = C()
    println(cb.method1())
    println(cb.method2())
    /* Kotlin: Unresolved reference: method
    println(cb.method())
     */

    val cd : D = C()
    println(cd.method())
    println(cd.method1())
    println(cd.method2())
}