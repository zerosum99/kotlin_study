
fun main(args : Array<String>) {
    val (min,max) = findMinMax(listOf(1,2,3,4))
    println("$min , $max ")

    val (min_, max_) = find(listOf(1,2,3,4))
    println("$min_ , $max_ ")

    val ll = mutableListOf<Int>()
    println(ll)
    ll.add(0)
    ll.add(1)
    println(ll)

    val (min__, max__) = findList(listOf(1,2,3,4))
    println("$min__ , $max__ ")

}

fun findMinMax(ll : List<Int>) : List<Int> {
    val a : MutableList<Int> = mutableListOf<Int>(0,0)
    a.clear()
    a.add(ll.minOrNull() ?: 0 )
    a.add( ll.maxOrNull() ?: 0)

    return a.toList()

}

fun find(ll : List<Int>) : Pair<Int, Int> {
    return Pair(ll.minOrNull() ?: 0, ll.maxOrNull() ?: 0)
}

fun findList(ll :List<Int>) : List<Int> {
    val a = arrayOf(0,0)
    a.set(0,ll.minOrNull() ?: 0)
    a.set(1, ll.maxOrNull() ?: 0)
    return a.asList()
}