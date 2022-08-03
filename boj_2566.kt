import java.util.*

fun main () {
    var max = 0
    var row = 0
    var col = 0
    for (i in 1 .. 9){
        val al = readln().split(" ").map { it.toInt() }
        val newMax = Collections.max(al)
        if (newMax >= max){
            max = newMax
            row = i
            col = al.indexOf(newMax) + 1
        }
    }
    println("$max")
    println("$row $col")
}
