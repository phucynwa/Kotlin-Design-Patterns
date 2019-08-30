package designpatterns.structural.decorator

fun main() {
    val hisDrink = Tea()
    hisDrink.mix()
    println()

    val yourDrink = MilkTea()
    yourDrink.mix()
    println()

    val myDrink = BubbleMilkTea()
    myDrink.mix()
    println()
}
