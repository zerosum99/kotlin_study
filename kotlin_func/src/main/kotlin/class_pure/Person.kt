package class_pure

class Person(val fist:String, val middle :String?, val last:String) {
    override fun toString(): String {
        return "${this.javaClass.name}(${this.fist},${this.middle?:" "}, ${this.last})"
    }
}