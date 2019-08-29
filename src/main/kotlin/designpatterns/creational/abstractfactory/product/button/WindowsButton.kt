package designpatterns.creational.abstractfactory.product.button

class WindowsButton: Button {
    override fun paint() {
        println("Paint Windows button")
    }
}
