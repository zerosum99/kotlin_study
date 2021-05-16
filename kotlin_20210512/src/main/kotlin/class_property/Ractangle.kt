package class_property

class Ractangle (val height : Int, val width : Int){
    val isSquare : Boolean
        get() {
            return height == width
        }
}