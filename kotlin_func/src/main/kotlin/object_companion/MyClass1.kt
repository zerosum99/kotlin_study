package object_companion

class MyClass1{
    companion object MyCompanion{  // -- (1)
        val prop = "나는 MyCompanion 1 object의 속성이다."
        fun method() = "나는 MyCompanion 1 object의 메소드다."
    }
}