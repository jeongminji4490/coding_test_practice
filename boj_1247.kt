import java.math.BigInteger

fun main () {
    var sum = BigInteger("0")
    repeat(3) {
        val n = readln().toInt()
        repeat(n) {
            sum = sum.add(readln().toBigInteger())
        }
        println(
            if (sum == BigInteger.valueOf(0)) "0"
            else if (sum < BigInteger.valueOf(0)) "-"
            else "+"
        )
        sum = BigInteger.ZERO
    }
}
