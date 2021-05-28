import class_package_2.*

fun main(args : Array<String> ) {
    val p = Person("Dahl Moon")
    println(" Person instance " + p.name)

    val p2 = Person2("Dahl Moon")
    println(" Person2 instance " + p2.name)

    val p3 = Person3("Dahl Moon")
    println(" Person3 instance " + p3.name)

    val p4 = Person4("Dahl Moon")
    println(" Person4 instance " + p4.name)

    val m = Member("Dahl moon")
    println(" Member instance " + m.name + " " + m.registered)

    val persons = listOf(Member("Mike"), Member("Paul"))
    show(persons)

    val pp = Person6("dahl moon", 55)
    println(pp.component1() + " " + pp.component2())
    println(pp.name + " " + pp.age)
}

