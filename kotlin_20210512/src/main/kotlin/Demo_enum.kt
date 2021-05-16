import class_enum.*

fun main(args : Array<String>) {
    println(getMnemonic(Color.BLUE))
}

fun getMnemonic(color : Color) =
    when(color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.BLUE -> " Battle"
        Color.VIOLET -> "vain"
        Color.INDIGO -> "In"
        Color.GREEN  -> "Gave"
        else -> "all"
    }