package object_singleton

class Outer {
    val internal = object {
        val property = " 내부 익명 오브젝트 "
    }

    companion object Outer {
        val property = "이름있는 오브젝트"
    }

    object Test {
        val property = " 객체 내부의 속성 참조"
    }
}