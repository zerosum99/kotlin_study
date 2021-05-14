fun main(args : Array<String>) {
    println("Hello Kotlin World")

    val name = if (args.size>0) args[0] else "Kotlin"

    println("helle $name")
}