fun main () {
    var n = readln().toInt()
    println(factorial(n))
}

fun factorial(n : Int) : Int = when(n) {
    0 -> 1
    else -> { n * factorial(n-1) }
}
