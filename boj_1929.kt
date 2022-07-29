import kotlin.math.*

fun main () {
    val o = readln().split(" ").map { it.toInt() }
    val m = o[0]
    val n = o[1] 
    val check = BooleanArray(n + 1){true}
  
    for (num in m .. n) {
        val sqrt = sqrt(num.toDouble()).toInt()
        for (i in 2 .. sqrt){
            if (num%i == 0){
                check[num] = false
                break
            }
        }
    }
    for (i in m .. n){
        if (i == 1) continue
        if (check[i])
            println(i)
    }
}
