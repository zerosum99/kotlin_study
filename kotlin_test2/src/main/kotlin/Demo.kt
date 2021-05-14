fun main(args : Array<String>) {
    println("Hello World")

    println(" Hello, ${if (args.size > 0) args[0] else " someone"}")

    println(getStringLength(100))
    println(getStringLength("100"))

    println(getStringLength_("100"))
    println(getStringLength_(100))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
         // 이 코드 브랜치(branch)에서 `obj`는 자동으로 `String`으로 변환
         return obj.length
    }
    // 타입 검사 브랜치 밖에서 `obj`는 여전히 `Any` 타입
    return null
}

fun getStringLength_(obj: Any): Int? {
    if (obj !is String)
       return null
    // `obj`는 이 브랜치에서 자동으로 `String`으로 변환
    return obj.length
}