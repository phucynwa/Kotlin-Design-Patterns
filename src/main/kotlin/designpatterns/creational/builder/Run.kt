package designpatterns.creational.builder

fun main() {
    val firstHouse = buildTraditionallyHouse()
    val secondHouse = buildModernlyHouse()
    showHouseDetail(firstHouse)
    showHouseDetail(secondHouse)
}

fun buildTraditionallyHouse() = House.Builder()
    .setName("Traditional House")
    .setWall("Brick wall")
    .setDoor("Wood Door")
    .setRoof("Leaves Roof")
    .build()

fun buildModernlyHouse() = House(
    name = "Modern House",
    wall = "Concrete wall",
    door = "Glass Door",
    roof = "Metal Roof"
)

fun showHouseDetail(house: House) = with(house) {
    println(
        """
            [$name]
            Wall: $wall
            Door: $door
            Roof: $roof
            
        """.trimIndent()
    )
}
