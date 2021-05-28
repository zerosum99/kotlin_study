package interface_test

class Button : Clickable, Focusable {
    override fun click() {
        println(" I was clicked ")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}