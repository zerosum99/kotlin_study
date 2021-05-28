import lazy_proc.*

fun main(args : Array<String>) {
    val name : String by lazy { getName() }
    println(" Hello ")

    val name2 : String by lazy { name }
    println(" init process ")
    println(name)
    println(name2)

    lateinit var name3 : String

    println(" var int lateinit ")
    name3 = getName()
    println(name3)

}