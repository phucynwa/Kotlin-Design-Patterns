package designpatterns.structural.bridge

import designpatterns.structural.bridge.appliance.AirConditioner
import designpatterns.structural.bridge.appliance.Television
import designpatterns.structural.bridge.switch.RemoteControl

fun main() {
    val tvRemote = RemoteControl(appliance = Television())
    val airConditionerRemote = RemoteControl(appliance = AirConditioner())
    tvRemote.turnOn()
    airConditionerRemote.turnOn()
}
