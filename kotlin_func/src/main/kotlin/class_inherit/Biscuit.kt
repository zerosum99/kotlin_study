package class_inherit


class Biscuit(flavour: String) : BakeryGood(flavour) {
    override fun name(): String {
        return "비스킷"
    }
}