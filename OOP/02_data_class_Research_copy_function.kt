package OOP

data class User(
    val name:String,
    val age:Int
)

fun main() {

    val jack=User("jack",12)
    val mugerwa=jack.copy("Mugerwa")
    println("Hello ${jack.name}, you are aged ${jack.age}")
    println("Hello ${mugerwa.name}, you are aged ${mugerwa.age}")
}