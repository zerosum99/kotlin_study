import collections_.*
import kotlin.reflect.full.*
fun main(args : Array<String>) {
    class Foo : Cloneable


    Foo::class.members.forEach { i -> println(i) }

    Dir.dir()

    // super class is Serializable and Any by default
    class Bucket(var a:String, var flag:Boolean){
    }

    // create object for KClass using ::class
    val buckTypes = Bucket::class
    println(buckTypes.memberProperties)

    println("-----------------------------------------")

    Dir2.readProperties(listOf(1,2,3))

    println("-----------------------------------------")

    Dir2.readMembers(listOf(1,2,3))



}