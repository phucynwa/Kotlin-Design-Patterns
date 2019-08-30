package designpatterns.structural.composite

class Employee(
    private val name: String,
    private val salary: Int
) {
    private val subordinates = mutableListOf<Employee>()

    fun addSubordinates(vararg employees: Employee) = subordinates.addAll(employees)

    fun removeSubordinates(vararg employees: Employee) = subordinates.removeAll(employees)

    fun show(rank: Int = 0) {
        println()
        for (i in 0 until rank) print("\t")
        print("$name - $salary")
        if (subordinates.isNotEmpty()) {
            print(" {")
            for (subordinate in subordinates) subordinate.show(rank + 1)
            println()
            for (i in 0 until rank) print("\t")
            print("}")
        }
    }
}
