package class_test

object StateManager : CaptureMessage {
    var msgNumber : Int = 0
    var msgContent : String = ""

    fun storeMessage() {
        println("message no =" + msgNumber + ", contents =" + msgContent)
    }

    override fun capture() {
        println(" interface capture override ")
    }
}