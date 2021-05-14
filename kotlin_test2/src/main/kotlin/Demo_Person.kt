import class_group.*

fun main(args:Array<String>) {
    println(" Hello world ")

    val p = Person()
    p.name = "aaa"
    p.age = 30

    println("${p.name} ${p.age}")

    println(" 커스텀 게터세터 처리 ")

    val pp = Person()
    pp.name = "dahl"
    pp.age = 54
    println("${pp.name} ${pp.age}")
}