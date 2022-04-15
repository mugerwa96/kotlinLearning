package conditional_statement

fun main() {
    val guests=100
    if(guests==0)
    {
        println("No guests")
    } else if(guests<50)
    {
        println("Few guests")
    }
    else
    {
        println("Large group")
    }

}