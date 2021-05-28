package inheritance_test
import interface_test.*

open class RichButton  : Clickable {
    fun disable() {
        println(" no override ")
    }
    open fun animate() {
        println(" override animate ")
    }
    override fun click() {
        println("override Rich Button")
    }
}