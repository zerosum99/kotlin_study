package class_test

abstract class PlayMusic_A {
    abstract val abs : Int
    val musicalInstrument : String = "파이프오르간"
    val instrumentType : Int
        get() = 1
    abstract  fun play()
    open fun sing() {}
}