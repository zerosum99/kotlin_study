package class_inherit

class Donut(flavour : String, val topping : String) : BakeryGood(flavour), Fried {
    override fun name(): String {
        return "$topping (으)로 토핑된 도넛"
    }

    override fun fry(): String {
        return " 기름으로 틔기기 "
    }
}