package designpatterns.structural.adapter

fun main() {
    val horse = Horse(
        meterPerStep = 0.85F,
        stepPerMin = 120
    )
    val vehicle: Vehicle = VehicleAdapter(horse)
    println(vehicle.getSpeedMpm())
}
