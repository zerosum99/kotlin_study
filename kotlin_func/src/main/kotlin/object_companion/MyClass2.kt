package object_companion

class MyClass2{
    companion object MyCompanion1{
        val prop1 = "나는 Companion1 object의 속성이다."
        fun method1() = "나는 Companion1 object의 메소드다."
    }

    /*
    companion object MyCompanion2{ // --  에러발생!! Only one companion object is allowed per class
        val prop2 = "나는 Companion object의 속성이다."
        fun method2() = "나는 Companion object의 메소드다."
    }
    */

}