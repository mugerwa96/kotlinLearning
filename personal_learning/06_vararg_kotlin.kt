package personal_learning

fun main() {
    names("mugerwa","tom","james","epetwe","allan")

}
fun names(vararg names:String)
{
    for(name in names)
        println(name)

}

//vararg creates an array of strings