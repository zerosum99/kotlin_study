fun main(args : Array<String>) {
    val a = 100
    val b = 200
    println(if (a > b) a else b)

    val l1 = listOf(1,2,3,4)
    val l2 = listOf(1,2,3,4)
    println(l1 == l2)
    println(l1.equals(l2))
    println(l1 === l2)

    val elvis = Person__("elvis")
    val thee  = Person__("elvis")

    println(elvis == thee)



}

data class Person__(val name :String)