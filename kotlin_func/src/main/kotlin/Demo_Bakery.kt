import class_inherit.*

fun main() {
    val myBlueberryCupcake : BakeryGood = Cupcake("블루베리")
    println(myBlueberryCupcake.eat())

    val myDonut = Donut("커스터드", "파우더 슈거")
    val mario = Customer("마리오")
    mario.eats(myDonut)
    //익명 객체 생성

    mario.eats(object : BakeryGood("Test 1") {
        override fun name(): String {
            return "Test_2"
        }
    })

    val an = object : BakeryGood("익명객체") {
        override fun name() : String {
            return "xxx"
        }
    }
    mario.eats(an)

    val cup = Cupcake("ㅎㅎㅎㅎ")
    println(cup.bake())

    val don = Donut(" 도넛 ","토핑추가")
    println(don.fry())

    val fr = object : Fried {
        override fun fry(): String {
            return " test test"
        }
    }
    println(fr.fry())

}