import class_sealed.*

fun main() {
    val num1 = Const(10.0)
    val num2 = Const(20.0)
    val sum = Sum(num1, num2)
    val result = eval(sum)
    println("result : $result")

    getDirection(Direction.NORTH)
    getDirection(Direction.SOUTH)
    getDirection(Direction.EAST)
    getDirection(Direction.WEST)
}

fun eval(expr: Expr): Double = when(expr) {
    is Const -> {
        println(expr.number)
        expr.number
    }
    is Sum -> {
        eval(expr.e1) + eval(expr.e2)
    }
    NotANumber -> {
        Double.NaN
    }
}

fun getDirection(d:Direction) {
    when(d) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")
    }
}

