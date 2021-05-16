package collections_

object Coll_list2 {

    fun immulist() {
        val list = listOf(1,2,3,"String")
        println(" list of " + list)

        println("size " +list.size) // size

        // 특정 값(value)의 존재 유무 (Boolean)
        if(list.contains(1)){
            println(true)
        }else{
            println(false)
        }

        // 특정 값(value)의 위치 추출
        println(" list index " + list.indexOf(2))

        // 특정 위치(index)의 값(value)의 추출
        println("list indexing " + list[2])
    }
}