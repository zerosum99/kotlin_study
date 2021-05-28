package nested_inner_class

class Outer {
    inner class Inner {
        fun getOuterReference() : Outer = this@Outer
    }
}