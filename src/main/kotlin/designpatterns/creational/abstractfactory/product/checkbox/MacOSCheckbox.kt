package designpatterns.creational.abstractfactory.product.checkbox

class MacOSCheckbox : Checkbox {
    override fun paint() {
        println("Paint Mac OS checkbox")
    }
}
