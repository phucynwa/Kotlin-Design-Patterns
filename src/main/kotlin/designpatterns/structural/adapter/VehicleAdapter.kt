package designpatterns.structural.adapter

class VehicleAdapter(
    private val animal: Animal
) : Vehicle {
    override fun getSpeedMpm() = (animal.meterPerStep * animal.stepPerMin).toInt()
}
