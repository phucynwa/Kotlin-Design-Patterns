package designpatterns.structural.bridge.appliance

class Television : Appliance {
    override fun run() {
        println("Television has been turned on.")
    }
}
