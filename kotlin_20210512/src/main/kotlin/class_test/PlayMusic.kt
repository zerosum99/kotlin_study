package class_test

interface PlayMusic {
    val musicalInstrument : String
    // 인터페이스에서는 속성에 값을 할당할 수 없음 val a = 100
    val instrumetType : Int
        get() = 1
    fun play(mi : String)
}