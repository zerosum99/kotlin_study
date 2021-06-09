import class_pure.*

fun main(args: Array<String>) {
    val jk = Person("Jeanne",null, "Rowling")
    val dl = Person("Dahl", "yj", "Moon")

    println(jk)
    if (jk.middle == null) {
        val middlelength = jk.middle?.length ?: 0
        println(middlelength)
    }
    println(dl)
    if (dl.middle != null) {
        var middlelength = dl.middle!!.length
        println(middlelength)
    }

    val x : Int = 100
    val y : Long = x.toLong()  // 할당할때 타입이 자동변환이 안됨

    println("${x.javaClass.name} ${y.javaClass.name}")
}

