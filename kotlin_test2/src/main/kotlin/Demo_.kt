/*
    컴파일 : kotlinc Demo_.kt -include-runtime -d Demo_.jar
    자바 실행 : java -jar Demo_.jar 100 200
    코들린 실행 : kotlin Demo_.jar 999 8888

 */
fun main(args: Array<String>) {
    if (args.size < 2) {
        print("Two integers expected");
        return
    }
    val x = args[0].toInt()
    val y = args[1].toInt()

    println("$x,$y ")

    if (x != null && y != null) {
      // null 검사 후에 x와 y를 non-nullable로 자동 변환
        println(x * y)
    }
    /*...s
    if (x != null) {
        print("Wrong number format in '${args[0]}'")
        return
    }
    if (y != null) {
        print("Wrong number format in '${args[1]}'")
        return
    }
    // null 검사 후에 x와 y를 non-nullable로 자동 변환 print(x * y) */
}