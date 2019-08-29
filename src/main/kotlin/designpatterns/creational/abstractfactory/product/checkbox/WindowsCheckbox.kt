package designpatterns.creational.abstractfactory.product.checkbox

class WindowsCheckbox : Checkbox {
    override fun paint() {
        println("Paint Windows checkbox")
    }
}
