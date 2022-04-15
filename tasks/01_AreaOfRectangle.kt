package tasks

fun main() {
    val length=42
    val width=0.42
//    calculating the area ,integer * double results into a double since the double is of high priority
    val area=(length*width)
    println("The area of a rectangle whose length is $length  and width  $width is $area")

}