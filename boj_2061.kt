import java.math.BigInteger

fun main () {
    val n = readln().split(" ").map { it.toBigInteger() }
    val k = n[0]
    val l = n[1]
    var badNum = 0
    for (i in 2 until l.toInt()){
        if (k%i.toBigInteger() == BigInteger.ZERO) {
            badNum = i
            break
        }
    }
    if (badNum == 0) println("GOOD")
    else println("BAD $badNum")
}
