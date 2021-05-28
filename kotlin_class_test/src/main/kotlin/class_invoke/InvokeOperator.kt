package class_invoke

class InvokeOperator(val makeMessage1 : String) {
    operator fun invoke(makeMessage2 : String) {
        println(" $makeMessage1,  $makeMessage2")
    }
}