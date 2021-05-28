package abstract_class

class Animating : Animated() {
    override fun animate() {
        println(" override animate ")
    }

    override fun stopAnimating() {
        println(" default method Animated  override ")
    }
}