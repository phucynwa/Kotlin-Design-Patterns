package designpatterns.creational.abstractfactory.product.checkbox

class LinuxCheckbox : Checkbox {
    override fun paint() {
        println("Paint Linux checkbox")
    }
}
