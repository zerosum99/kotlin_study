package func
import java.lang.StringBuilder

fun String.lastChar() : Char = this.get(this.length -1)

fun String.lastChar_() : Char = get(length -1)  // this 생략

fun String.lastCharC() : Char = lastChar_()  // 확장함수로 정의된 메소드도 내부에서 호출가능



fun <T> Collection<T>.joinToString( separator : String, prefix : String, postfix : String) :String {
    val result = StringBuilder(prefix)
    for ((index,element) in this.withIndex()) {
        if (index > 0 ) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}