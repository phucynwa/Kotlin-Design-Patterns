package designpatterns.structural.bridge.appliance

class AirConditioner: Appliance {
    override fun run() {
        println("Air Conditioner has been turned on.")
    }
}
