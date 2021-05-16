package collections_

object Dir {

    fun dir() {
        List::class.members.forEach { i -> println(i) }
    }
}