package inheritance_test

class ManyRichButton : RichButton() {
    // open 처리가 안되어서 상속이 불가하다
    //override fun disable() {
    //    println(" ManyRichButton ")
    //}
    override fun animate() {
        println(" ManyRichButton override animate ")
    }
    override fun click() {
        println(" ManyRichButtonoverride Rich Button")
    }
}