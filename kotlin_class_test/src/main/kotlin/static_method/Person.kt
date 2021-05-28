package static_method

data class Person(val name:String, val age:Int) {
    companion object {
        fun create(name:String, age : Int) : Person {
            return Person(name, age)
        }
    }

}