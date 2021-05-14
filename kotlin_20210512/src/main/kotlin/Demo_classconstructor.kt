import class_constructor.*

fun main(args : Array<String>) {
    val p = Person("Dahl", 20)
    println(" Person object " + p.name + " " + p.age)

    println("------------------")
    val p_ = Person_("Moon", 55)
    println(" Person object " + p_.name + " " + p_.age)

    println("------------------")
    val p__ = Person__("Dahl", 55)
    print("${p__.message}"+"${p__.firstName}"+
            "Welcome to the example of Secondary  constructor, Your Age is-${p__.age}")

}
