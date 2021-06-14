
open class Parent{
    companion object{
        val prop = "나는 부모"
    }
    open fun method() = prop //Companion.prop과 동일
}
class Child:Parent(){
    companion object{
        val prop = "나는 자식"
    }
    override fun method() = prop //Companion.prop 과 동일
}
fun main(args: Array<String>) {
    println(Parent().method()) //나는 부모
    println(Child().method()) //나는 자식
    val p:Parent = Child()
    println("자식 객체 ${p.method()}") // -- (1)
}

/*
다형성(Polymorphism)

 - 대체 가능성(substitution) – 어떤 형을 요구한다면 그 형의 자식형으로 그 자리를 대신할 수 있다.
 - 내적 동질성(internal identity) – 객체는 그 객체를 참조하는 방식에 따라 변화하지 않는다. 즉 업다운캐스팅해도 여전히 최초 생성한 그 객체라는 것입니다.
 */