
fun main(args : Array<String>) {
    val fruits= listOf<String>("apple", "banana", "kiwi", "peach")
   // val fruits= listOf("apple", "banana", "kiwi", "peach") -> 타입 생략 가능
    println("fruits.size: ${fruits.size}")
    println("fruits.get(2): ${fruits.get(2)}")
    println("fruits[3]: ${fruits[3]}")
    println("fruits.indexOf(\"peach\"): ${fruits.indexOf("peach")}")


    val fruits1= mutableListOf<String>("apple", "banana", "kiwi", "peach")
    fruits1.remove("apple")
    println("fruits: $fruits1")
    fruits1.add("grape")
    println("fruits: $fruits1")

    fruits1.addAll(listOf("melon", "cherry"))
    println("fruits: $fruits1")
    fruits1.removeAt(3)
    println("fruits: $fruits1")

    val numbers = setOf<Int>(33, 22, 11, 1, 22, 3)
    println(numbers)
    println("numbers.size: ${numbers.size}")
    println("numbers.contains(1): ${numbers.contains(1)}")
    println("numbers.isEmpty(): ${numbers.isEmpty()}")

    val numbers1 = mutableSetOf<Int>(33, 22, 11, 1, 22, 3)
    println(numbers1)
    numbers1.add(100)
    numbers1.remove(33)
    println(numbers1)
    numbers1.removeIf({ it < 10 }) // 10 이하의 숫자를 삭제
    println(numbers1)

    val numbersMap = mapOf<String, String>("1" to "one", "2" to "two", "3" to "three")
    println("numbersMap: $numbersMap")
    val numbersMap2 = mapOf(Pair("1", "one"), Pair("2", "two"), Pair("3", "three"))
    println("numbersMap2: $numbersMap2")
    println("numbersMap.get(\"1\"): ${numbersMap.get("1")}")
    println("numbersMap[\"1\"]: ${numbersMap["1"]}")
    println("numbersMap[\"1\"]: ${numbersMap.values}")
    println("numbersMap keys:${numbersMap.keys}")
    println("numbersMap values:${numbersMap.values}")

    for (value in numbersMap.values) {
        println(value)
    }

    val numbersMap1 = mutableMapOf<String, String>(
        "1" to "one", "2" to "two", "3" to "three")
    println("numbersMap: $numbersMap1")

    numbersMap1.put("4", "four")
    numbersMap1["5"] = "five"
    println("numbersMap: $numbersMap1")

    numbersMap1.remove("1")
    println("numbersMap: $numbersMap1")

    numbersMap1.clear()
    println("numbersMap: $numbersMap1")

    fun printAll(strings: Collection<String>) {
        for(s in strings) print("$s ")
        println()
    }

    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

}