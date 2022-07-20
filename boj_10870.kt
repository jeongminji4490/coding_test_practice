fun main() {
    val num = readln().toInt()
    println(fibonacci(num))
}

fun fibonacci(num: Int) : Int = when(num) {
    0 -> 0
    1 -> 1
    else -> fibonacci(num - 1) + fibonacci(num - 2)
}
