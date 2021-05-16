
fun main(args : Array<String>) {
    data class ExampleDataClass(
        val name: String, var enabled: Boolean)

    ExampleDataClass::class.java.methods.forEach(::println)

    println("---------------------------")

    open class BaseExample(val baseField: String)

    class Example(val field1: String, val field2: Int, baseField: String):
        BaseExample(baseField) {

        val field3: String
            get() = "Property without backing field"

        val field4 by lazy { "Delegated value" }

        private val privateField: String = "Private value"
    }
    val example = Example(field1 = "abc", field2 = 1, baseField = "someText")

    example::class.members.forEach { member ->
        println("${member.name} ")
    }
}