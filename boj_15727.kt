import java.util.*
import kotlin.math.ceil
import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main() {
    val distance = readln().toDouble()
    val num = distance/5
    println(ceil(num).toInt())
}
