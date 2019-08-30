package designpatterns.structural.decorator

open class MilkTea : Tea() {
    override fun mix() {
        super.mix()
        bonus()
    }

    open fun bonus() {
        println("Add milk")
    }
}
