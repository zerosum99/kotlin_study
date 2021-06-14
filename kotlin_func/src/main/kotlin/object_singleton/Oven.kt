package object_singleton
import class_inherit.*

object Oven {
    fun process(product: Bakerable) {
        println(product.bake())
    }
}