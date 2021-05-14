package class_test

class Professional_A  : PlayMusic_A() {
    override val abs: Int
        get() = 1
    override fun play() {
        println(" 구현 클래스 ")
    }

    override fun sing() {
        println("노래 불러요")
    }
}