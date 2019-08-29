package designpatterns.creational.abstractfactory.factory

import designpatterns.creational.abstractfactory.product.button.Button
import designpatterns.creational.abstractfactory.product.button.LinuxButton
import designpatterns.creational.abstractfactory.product.button.MacOSButton
import designpatterns.creational.abstractfactory.product.button.WindowsButton
import designpatterns.creational.abstractfactory.product.checkbox.Checkbox
import designpatterns.creational.abstractfactory.product.checkbox.LinuxCheckbox
import designpatterns.creational.abstractfactory.product.checkbox.MacOSCheckbox
import designpatterns.creational.abstractfactory.product.checkbox.WindowsCheckbox

sealed class UIFactory {
    abstract fun createButton(): Button
    abstract fun createCheckbox(): Checkbox

    object LinuxFactory : UIFactory() {
        override fun createButton() = LinuxButton()
        override fun createCheckbox() = LinuxCheckbox()
    }

    object WindowsFactory : UIFactory() {
        override fun createButton() = WindowsButton()
        override fun createCheckbox() = WindowsCheckbox()
    }

    object MacOSFactory : UIFactory() {
        override fun createButton() = MacOSButton()
        override fun createCheckbox() = MacOSCheckbox()
    }
}
