import kotlin.math.*

fun main () {
    val n = readln().split(" ").map { it.toDouble() }
    val newAvg = n[1] - 1 + 0.01
    val result = n[0] * newAvg
    println(ceil(result).toInt())
}
