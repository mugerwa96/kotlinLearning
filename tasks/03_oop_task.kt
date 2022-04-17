package tasks

data class Student(
    val name: String,
    val contact: String,
    val studentNumber: Int,
    val studentEmailAddress: String,
    val university:String


    )

object University{
    const val name:String="Kyambogo University"
}

fun main() {
    val s1=Student("mugerwa","0751189781",1900802944,"mugerwa@kyu.ac.ug",University.name)
    println(s1)
    val s2=Student("derrick","0751659781",1900806764,"deerick@kyu.ac.ug",University.name)
    println(s2)
}