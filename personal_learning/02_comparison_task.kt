fun main() {

    var time=10
    when (time) {
        in 0..11 -> {
            println("Good morning")
        }
        12 -> {
            println("Nice lunch")
        }
        else -> {
            println("Good day")
        }
    }
}