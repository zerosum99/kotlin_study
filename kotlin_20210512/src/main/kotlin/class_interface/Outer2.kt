package class_interface

class Outer2 {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}