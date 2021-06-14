package class_inherit

class Customer(val name :String) {
    fun eats(fool : BakeryGood) {
        println("$name 이(가) ${fool.eat()}을(를) 먹는다. ")
    }
}