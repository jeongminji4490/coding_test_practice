fun main () {
    val n = readln().split(" ").map{ it.toInt() }
    var f = n[0] 
    var m = n[1] 
    var c = (f + m) - n[2] 
    val nf = 2
    val nm = 1
    var sum = 0
    while (true) {
        c = c - nf - nm
        if (c < 0 || f < 2 || m < 1)
            break
        sum+=1
        f -= nf
        m -= nm
    }
    println(sum)
}
