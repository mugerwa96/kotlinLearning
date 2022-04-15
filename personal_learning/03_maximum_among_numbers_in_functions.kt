package personal_learning
fun main() {
   println(getMax(2,3))
}
fun getMax(num1:Int,num2:Int)=when{
    num1>num2->num1
    else ->num2
}