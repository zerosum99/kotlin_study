package object_test

open class Outer () {
    init {
        InnerObject.count += 1
    }
    object InnerObject {
        var count : Int = 0
        fun printCount() {
            println(" innner object = "+ count )
        }
    }
}