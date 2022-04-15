//fun main() {
// for(i in  1..10)
// {
//     if(i>3 && i<8) continue
//     println(i)
// }
//}

fun main() {

    for(i in 1..10)
    {
        if(i in 2..4)
            break

        println(i)
    }
}