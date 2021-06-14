fun main() {
    var s1 : String? = "let func test"

    println(s1?.javaClass)
    s1?.let {strPrint(s1)}

    s1?.let {x -> strPrint(x)}

    s1?.let {strPrint(it)}

    if (s1 is String) {
        println(s1.javaClass)
        strPrint(s1)
    }
}

fun strPrint(x:String) {
    println(x)
}