package designpatterns.structural.bridge.switch

import designpatterns.structural.bridge.appliance.Appliance

class RemoteControl(
    override var appliance: Appliance
) : Switch {
    override fun turnOn() = appliance.run()
}

