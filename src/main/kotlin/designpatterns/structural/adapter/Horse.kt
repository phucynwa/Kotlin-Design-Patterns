package designpatterns.structural.adapter

class Horse(
    override val meterPerStep: Float,
    override val stepPerMin: Int
) : Animal
