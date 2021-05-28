package class_operator_overload

data class Score(val a:Int, val b:Int) {
    operator fun plus(other : Score) : Score {
        return Score(a+ other.a, b+other.b )
    }
}