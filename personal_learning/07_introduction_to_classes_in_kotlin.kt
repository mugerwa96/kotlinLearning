
class User(name:String="",age:Int=0)
{
    private var name=name
    private  val age = age

    init {
        if(name.isBlank())
        {
            this.name="No name passed"
        }else
        {
            this.name=name.trim()
        }
    }
    fun display()
    {
        println("Hello Mr ${this.name} aged ${this.age}")
    }
}

fun main() {
    val user1=User("        ger ")
    user1.display()
}