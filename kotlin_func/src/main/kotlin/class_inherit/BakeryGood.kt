package class_inherit

abstract class BakeryGood(val flavour : String) {

    init {
        println(" 추상 클래스의 초기화 처리")
    }
    fun eat() : String {
        return " 냠냠냠, 맛있는 $flavour ${name()}"
    }

    abstract fun name() : String
 }