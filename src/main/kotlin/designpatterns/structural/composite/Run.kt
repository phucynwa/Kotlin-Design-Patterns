package designpatterns.structural.composite

fun main() {
    val peter = Employee("Peter", 1200)
    val john = Employee("John", 600)
    val adam = Employee("Adam", 800)
    val jack = Employee("Jack", 400)
    peter.addSubordinates(john, adam)
    john.addSubordinates(jack)
    peter.show()
}
