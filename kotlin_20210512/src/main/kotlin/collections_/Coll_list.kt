package collections_

object Coll_list {

    fun mulist() {
        val list = mutableListOf(1,2,3)
        println(" list " + list)

        // size
        println(list.size)

        // 특정 값(value)의 존재 유무 (Boolean)
        if(list.contains(1)){
            println(true)
        }else{
            println(false)
        }

        // 특정 값(value)의 위치 추출
        println(list.indexOf(2))

        // 특정 위치(index)의 값(value)의 추출
        println(list[2])

        val mulist: MutableList<Int> = mutableListOf<Int>(10, 20, 11, 23, 55)
        println(" mutable list " + mulist)

        mulist.add(500) //output : 10, 20, 11, 23, 55, 500
        println(" last add " + mulist)
        mulist.add(3, 111) //output : 10, 20, 11, 111, 23, 55, 500
        println(" indexing add " + mulist)

        val list_ = listOf<Int>(1, 2, 3)
        mulist.addAll(2, list_)  //output : 10, 20, 1, 2, 3, 11, 111, 23, 55, 500
        println(" multi add " + mulist)

        list.removeAt(0)

        var s = list.size
        for(i in 0 until s){
            print(list[i])
            print(" ")
        }
        println()

        list.addAll(listOf(2,3,4))

        s = list.size
        for(i in 0 until s){
            print(list[i])
            print(" ")
        }
        println()

        //iterator
        val mulist2: MutableList<Int> = mutableListOf(10, 20, 11, 23, 55)

        val it1 = mulist2.iterator()
        println("it1 " + it1)
        val it2 = mulist2.listIterator()
        println("it2 " + it2)

        it2.forEach {i -> println(i)}

        while(it1.hasNext()) println(it1.next())    //output 10, 20, 11, 23, 55)
    }

}