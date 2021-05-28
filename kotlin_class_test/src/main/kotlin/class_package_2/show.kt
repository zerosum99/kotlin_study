package class_package_2

fun show(persons : List<Member>) {
    for ( person in persons) {
        println(person.name  + person.registered )
    }
}