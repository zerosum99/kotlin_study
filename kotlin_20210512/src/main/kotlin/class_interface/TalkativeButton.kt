package class_interface

open class TalkativeButton  : Focusable{
    private fun yell() = println("Hey!1")
    fun whisper() = println("Let's talk!!!")

}

fun TalkativeButton.giveSpeech() {
    //yell()
    whisper()
}