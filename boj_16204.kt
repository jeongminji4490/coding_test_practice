import kotlin.math.*

fun main () {
    val list = readln().split(" ").map { it.toInt() }
    val n = list[0] 
    val m = list[1] 
    val k = list[2] 

    val fo = m 
    val fx = n - m 

    val bo = k 
    val bx = n - k 

    println(min(fo, bo) + min(fx, bx))
}
