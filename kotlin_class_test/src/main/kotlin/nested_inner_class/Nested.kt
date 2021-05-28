package nested_inner_class

class Nested {
    class Inner {
        fun getOuterReference() : Nested =  Nested()  //this@Nested
    }
}