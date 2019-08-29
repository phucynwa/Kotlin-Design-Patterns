package designpatterns.creational.singleton

object Singleton {
    const val value = 1
    var variable = "Variable"

    fun print() {
        println("$value - $variable")
    }
}
