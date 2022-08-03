import java.util.*

fun main () {
    val list = mutableListOf<Int>()
    repeat(9) {
        list.add(readln().toInt())
    }
    val max = Collections.max(list)
    println(max)
    println(list.indexOf(max) + 1)
}
