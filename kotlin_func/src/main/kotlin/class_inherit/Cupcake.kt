package class_inherit

class Cupcake(flavour : String) : BakeryGood(flavour), Bakerable{
    override fun name() : String {
        return "컵케이크"
    }

    companion object {
        fun almond() : Cupcake {
            return Cupcake("아몬드")
        }
        fun cheese() : Cupcake {
            return Cupcake("치즈")
        }
    }
}