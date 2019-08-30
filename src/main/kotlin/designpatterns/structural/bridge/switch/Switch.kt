package designpatterns.structural.bridge.switch

import designpatterns.structural.bridge.appliance.Appliance

interface Switch {
    var appliance: Appliance
    fun turnOn()
}
