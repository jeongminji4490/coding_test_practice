import java.math.BigInteger

fun main () {
    val n = readln().split(" ")

    var result1 = BigInteger.ZERO
    var result2 = BigInteger.ZERO

    n[0].forEach {
        val n = Character.getNumericValue(it)
        val bigNum = n.toBigInteger()
        result1 += bigNum
    }
    n[1].forEach {
        val n = Character.getNumericValue(it)
        val bigNum = n.toBigInteger()
        result2 += bigNum
    }
    println(result1.multiply(result2))
}
