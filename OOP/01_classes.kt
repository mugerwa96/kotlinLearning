package OOP

//definfinig a class
class House {
    val color:String="white"
    val numberOfWindows:Int=2
    val isForSale:Boolean=false
    fun updateColor(newColor:String)
    {

    }
}
fun main()
{
    //creating new object instance
    val myHouse=House()
    println(myHouse)
}
