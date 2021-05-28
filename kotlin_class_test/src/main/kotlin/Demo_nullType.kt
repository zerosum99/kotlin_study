fun main(args : Array<String>) {
    val s : String? = null
    val l = if (s!=null) s.length else null

    println(l)

    println(nullCheck(s))
    println(safeCall(s))
    println(elvis(s))

    val x = "Hello world"
    println(nullCheck(x))
    println(safeCall(x))
    println(elvis(x))

    val a : Int = 100
}

fun nullCheck(s : String? ) :Int? = if (s!=null) s.length else null

fun safeCall(s: String? ) : Int? = s?.length

fun elvis(s:String?) :Int? = s?.length?:null