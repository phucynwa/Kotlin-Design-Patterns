package designpatterns.structural.decorator

class BubbleMilkTea : MilkTea() {

    override fun bonus() {
        super.bonus()
        println("Add bubbles.")
    }
}
