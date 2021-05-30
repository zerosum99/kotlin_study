import pure_func.*

fun main(args : Array<String>) {
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")              // 6
    printMessageWithPrefix("Hello")                              // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                               // 9
    println(multiply(2, 4))
}