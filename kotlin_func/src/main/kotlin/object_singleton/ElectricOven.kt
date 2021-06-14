package object_singleton

import class_inherit.Bakerable

object ElectricOven : Oven_ {
    override fun process(product: Bakerable) {
        println("Ele ${product.bake()}")
    }
}