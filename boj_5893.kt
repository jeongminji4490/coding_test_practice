import java.math.BigInteger

fun main () {
    val a = readln()
    val b = a.toBigInteger(2)
    val result = b * BigInteger.valueOf(17)
    println(result.toString(2))
}
