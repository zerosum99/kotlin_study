
fun main() {
    list_basic()
    list_indexing()
    list_count()

}

fun list_basic() {
    val nums = listOf(11, 5, 3, 8, 1, 9, 6, 2)

    val len = nums.count()
    val max = nums.maxOrNull()  //max 대신
    val min = nums.minOrNull()  //min 대신
    val sum = nums.sum()
    val avg = nums.average()

    val msg = """
               max: $max, min: $min,
               count: $len, sum: $sum,
               average: $avg
              """
    println(msg.trimIndent())
}

fun list_indexing() {
    val words = listOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles", "cup", "bread")

    val w1 = words.get(0)
    println(w1)

    val w2 = words[0]
    println(w2)

    val i1 = words.indexOf("cup")
    println("The first index of cup is $i1")

    val i2 = words.lastIndexOf("cup")
    println("The last index of cup is $i2")

    val i3 = words.lastIndex
    println("The last index of the list is $i3, size ${words.size}")
}

fun list_count() {
    val nums = listOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

    val len = nums.count()
    println("There are $len elements")

    val size = nums.size
    println("The size of the list is $size")

    val n1 = nums.count { e -> e < 0 }
    println("There are $n1 negative values")

    val n2 = nums.count { e -> e % 2 == 0 }
    println("There are $n2 even values")
}