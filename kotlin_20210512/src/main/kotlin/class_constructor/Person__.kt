package class_constructor

class Person__ (val firstName: String, var age: Int) {
    val message:String  = "Hey!!!"
    constructor(name : String , age :Int ,message :String):this(name,age) {
    }
}