fun main(args: Array<String>) {
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Your Int Value is "+a);
    println("Your Double  Value is "+d);
    println("Your Float Value is "+f);
    println("Your Long Value is "+l);
    println("Your Short Value is "+s);
    println("Your Byte Value is "+b);

    println("--------------------")

    val letter: Char    // defining a variable
    letter = 'A'        // Assigning a value to it
    println("$letter")

    println("--------------------")
    val letter_: Boolean   // defining a variable
    letter_ = true         // Assinging a value to it
    println("Your character value is "+"$letter_")


    println("--------------------")
    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\n"

    println("Hello!"+escapedString)
    println("Hey!!"+rawString)
    println("--------------------")
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array Example"+numbers[2])


    println("--------------------")
    val numbers_: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
    val readOnlyView: List<Int> = numbers_                  // immutable list
    println("my mutable list--"+numbers_)        // prints "[1, 2, 3]"
    numbers_.add(4)
    println("my mutable list after addition --"+numbers_)        // prints "[1, 2, 3, 4]"
    println(readOnlyView)
    numbers_.clear()
    println(" mutable " + numbers_)
}