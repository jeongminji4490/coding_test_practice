import java.util.*

fun main () {
    val n = readln().toInt()
    val f = readln().toInt()
    val min = n - (((n%100/10)*10 + n%10))
    val max = min + 99

    val l = mutableListOf<Int>()
    var result = ""

    var result1 = n
    var result2 = n

    while (result1 <= max) {
        if (result1 % f == 0) l.add(result1)
        result1 += 1
    }
    while (result2 >= min) {
        if (result2 % f == 0) l.add(result2)
        result2 -= 1
    }

    result = if (l.isNotEmpty()) {
        val r = Collections.min(l)
        ((r%100)/10).toString() + (r%10).toString()
    } else {
        ((n%100)/10).toString() + (n%10).toString()
    }
    
    println(result)
}
