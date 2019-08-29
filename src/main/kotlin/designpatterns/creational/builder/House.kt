package designpatterns.creational.builder

class House(
    val name: String?,
    val wall: String?,
    val door: String?,
    val roof: String?
) {
    data class Builder(
        private var name: String? = null,
        private var wall: String? = null,
        private var door: String? = null,
        private var roof: String? = null
    ) {
        fun setName(newName: String) = apply { name = newName }

        fun setWall(newWall: String) = apply { wall = newWall }

        fun setDoor(newDoor: String) = apply { door = newDoor }

        fun setRoof(newRoof: String) = apply { roof = newRoof }

        fun build() = House(name, wall, door, roof)
    }
}
