package collections_

import kotlin.reflect.full.*

object Dir2 {

    /**
     * Created by sanf0rd on 19/06/17.
     */

    fun readProperties(instance: Any) {
        val clazz = instance.javaClass.kotlin
        clazz.members.forEach {
            println("${it}")
        }
    }

    fun readMembers(instance : Any) {
        instance::class.members.forEach { member ->
            println("${member.name} ")
        }
    }
}