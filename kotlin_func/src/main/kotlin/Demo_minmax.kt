
fun main(args : Array<String>) {
    val (min,max) = findMinMax(listOf(1,2,3,4))
    println("$min , $max ")

    val (min_, max_) = find(listOf(1,2,3,4))
    println("$min_ , $max_ ")
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