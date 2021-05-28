import abstract_class.Animating
import inheritance_test.ManyRichButton
import interface_test.Button

fun main(args : Array<String>) {
    println(" Hello Demo ")

    val b = Button()
    b.click()
    b.showOff()
    b.setFocus(true)

    val mrb = ManyRichButton()
    mrb.animate()
    mrb.click()
    //mrb.disable()  // final이라 상속할 수 없다

    val ani = Animating()
    ani.animate()
    ani.stopAnimating()
    ani.animateTwice()
}