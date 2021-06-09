package collection_func

fun <T> list_of(vararg elem : T) : List<T> {
    if (elem.size > 0 ) {
        return elem.asList()
    } else {
        return emptyList<T>()
    }
}