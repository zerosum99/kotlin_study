package pure_func

fun f(x:Long) :Long {
    return  x*x
}

val uppercase = { str:String -> str.uppercase()}

val upper = object : Function1<String, String> {
    override fun invoke(p1: String): String {
        return p1.uppercase()
    }
}

fun transform(str : String, fn : (String)-> String) : String {
    return fn(str)
}
