package abstract_class

abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {
         println(" default method Animated ")
     }

    fun animateTwice() {
        println(" final deffault method Animated ")
    }
}