package designpatterns.creational.abstractfactory.product.button

class MacOSButton : Button {
    override fun paint() {
        println("Paint Mac OS button")
    }
}
