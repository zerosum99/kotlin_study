package object_companion

interface MyInterface{
    companion object{
        val prop = "나는 인터페이스 내의 Companion object의 속성이다."
        fun method() = "나는 인터페이스 내의 Companion object의 메소드다."
    }
}