import java.math.BigInteger

fun main () {
    val list = readln().split(" ").map { it.toBigInteger() }
    val chicken = readln().toBigInteger()
    val sum = list[0] + list[1]
    val price = chicken.multiply(BigInteger.valueOf(2))
    if (sum < price){
        println(sum)
    }else {
        println(sum - price)
    }
}
