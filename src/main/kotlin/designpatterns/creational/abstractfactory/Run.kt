package designpatterns.creational.abstractfactory

import designpatterns.creational.abstractfactory.factory.UIFactory
import designpatterns.creational.abstractfactory.factory.UIFactory.LinuxFactory
import designpatterns.creational.abstractfactory.factory.UIFactory.MacOSFactory
import designpatterns.creational.abstractfactory.factory.UIFactory.WindowsFactory

fun main() {
    val osName = System.getProperty("os.name").toLowerCase()
    when {
        osName.contains("mac") -> makeUI(MacOSFactory)
        osName.contains("linux") -> makeUI(LinuxFactory)
        osName.contains("windows") -> makeUI(WindowsFactory)
    }
}

fun makeUI(uiFactory: UIFactory) {
    uiFactory.createCheckbox().paint()
    uiFactory.createButton().paint()
}
