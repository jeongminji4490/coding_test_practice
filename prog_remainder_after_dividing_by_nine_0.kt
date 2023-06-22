import kotlin.math.* 
import java.math.BigInteger

class Solution {
    fun solution(number: String): BigInteger = number.toBigInteger().rem(BigInteger("9"))
}
