package designpatterns.creational.abstractfactory.product.button

class LinuxButton : Button {
    override fun paint() {
        println("Paint Linux button")
    }
}
