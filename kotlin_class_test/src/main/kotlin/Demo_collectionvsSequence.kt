
fun main(args : Array<String>) {
    /* 최종 연산이 없는 경우 */
    val a = listOf(1, 2, 3, 4)
        .asSequence()
        .map {
            print("map : $it, ")
            it * it
        }
        .filter {
            print("filter : $it, ")
            it > 5
        }
    println(a.toList())

    val b = listOf(1, 2, 3, 4)
        .map {
            print("map : $it, ")
            it * it
        }
        .filter {
            print("filter : $it, ")
            it > 5
        }
    println(b)

    /* 최종 연산이 호출되는 경우 */
    val list = listOf(1, 2, 3, 4)
        .asSequence()
        .map {
            print("map : $it, ")
            it * it
        }
        .filter {
            print("filter : $it, ")
            it > 5
        }
        .toList()

    println("리스트 결과 : $list")


}