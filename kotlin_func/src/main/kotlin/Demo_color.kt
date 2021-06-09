import class_sealed.*

fun main() {
    enum_color(Color_.Green)
    sealed_color(Red)
    sealed_color_(Color__.Red)
}

fun enum_color(e : Color_) {
    when(e) {
        Color_.Red -> println("red")
        Color_.Bule -> println("blue")
        Color_.Green -> println("green")
    }
}

fun sealed_color(e : Color) {
    when(e) {
        is Red -> println("red sc ")
        is Green -> println("green sc")
        is Blue -> println("blue sc")
    }
}

fun sealed_color_(e : Color__) {
    when(e) {
        is Color__.Red -> println("red snc ")
        is Color__.Green -> println("green snc")
        is Color__.Blue -> println("blue snc")
    }
}