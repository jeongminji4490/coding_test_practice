fun main () {
    val n = readln().toInt()
    var p = n
    while (p>=1) {
        val sp = ((2*n-1)-(2*p-1))/2
        for (i in 1 .. sp)
            print(" ")
        for (i in (2*p-1) downTo 1)
            print("*")
        println()
        p--
    }
}
