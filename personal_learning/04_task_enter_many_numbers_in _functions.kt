package personal_learning

fun main() {
    number(2,3,3,4,5,6,5,4,3,2,2,2,2,455,5,5,5,5,5,)
}
fun number(vararg numbers:Int):Unit
{
    for( number in numbers)
    {

        println(number)
    }
}

//vararg enables us to enter any number of arguments in the
// function call to be passed to the function definition
// within our program