package OOP

open class Animal() {
    open lateinit var name:String
    open fun run(){
        println("Animal is running")
    }
}
class Tiger():Animal()
{

    override var name: String="Tiger"
    override fun run()
    {
        println("Tiger is running")
    }
}

fun main() {

    val x=Tiger()
    x.run()
  println(x.name)
}