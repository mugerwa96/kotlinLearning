package personal_learning

fun main() {
    setInformationDetails(
        age=12,
        name="Mugerwa",
        location = "kireka",
    )
}
fun setInformationDetails(name:String="Unknownuser", age:Int=1,location:String="kireka")
{
    println("Hello $name , aged $age,location $location")
}