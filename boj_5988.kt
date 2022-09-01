import java.math.BigInteger

fun main () {
    repeat(readln().toInt()){
        println(
            if (readln().toBigInteger().remainder(BigInteger.valueOf(2)) == BigInteger.ZERO)
                "even"
            else
                "odd"
        )
    }
}
