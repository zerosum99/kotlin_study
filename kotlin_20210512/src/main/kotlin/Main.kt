import class_test.*

fun main(args : Array<String>) {
    println("Hello world")
    val a = Child("red", "green")
    println(a)
    println(a.hairColor + " " + a.eyeColor)
    println("-------------------------------------------")

    val ac = Child_C("red", "green")
    println(ac)
    println(ac.hairColor + " " + ac.eyeColor)
    println("-------------------------------------------")

    val pro = Professional("피아노")
    println(pro)
    pro.play(pro.musicalInstrument)

    println("-------------------------------------------")
    val pro_a = Professional_A()
    println(pro_a)
    pro_a.play()
    println("-------------------------------------------")

    for (i in 1..10) {
        StateManager.msgNumber += 1
        StateManager.msgContent = StateManager.msgNumber.toString() + " message "
        StateManager.storeMessage()
    }

    StateManager.capture()

}