package designpatterns.creational.factorymethod.factory

import designpatterns.creational.factorymethod.vehicle.Bike
import designpatterns.creational.factorymethod.vehicle.Car
import designpatterns.creational.factorymethod.vehicle.Vehicle

sealed class VehicleFactory {
    abstract fun produce(): Vehicle

    object BikeFactory : VehicleFactory() {
        override fun produce(): Vehicle {
            println("Producing a bike...")
            return Bike()
        }
    }

    object CarFactory : VehicleFactory() {
        override fun produce(): Vehicle {
            println("Producing a car...")
            return Car()
        }
    }
}
