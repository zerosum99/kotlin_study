class Person(val name: String, val age: Int)

fun main(args : Array<String>) {

    val person = Person("Alice", 29)

    dir(person)


}

fun dir(obj : Any) {
    val kClass = obj.javaClass.kotlin

    println(" class name = " + kClass.simpleName) // Person
    println("*** class member name ***")
    kClass.members.forEach{ println(it.name) }
    println("*** class constructor  name ***")
    kClass.constructors.forEach{ println(it.name)}
}


