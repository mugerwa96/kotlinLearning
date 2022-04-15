package OOP

data class Employee(
    val name:String,
    val email:String,
    val company:String,
    )

object MyCompany{
    const val name:String="MyCompany"
}

fun main() {
    val employee=Employee("Jane","jane@intellectsoft.net",MyCompany.name) //primary constructor
    println(employee)
}
