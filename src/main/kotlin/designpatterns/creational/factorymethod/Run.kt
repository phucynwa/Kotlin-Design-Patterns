package designpatterns.creational.factorymethod

import designpatterns.creational.factorymethod.factory.VehicleFactory.BikeFactory
import designpatterns.creational.factorymethod.factory.VehicleFactory.CarFactory
import designpatterns.creational.factorymethod.vehicle.Vehicle

fun main() {
    val sampleCar: Vehicle = CarFactory.produce()
    val sampleBike: Vehicle = BikeFactory.produce()

    sampleCar.run()
    sampleBike.run()
}
