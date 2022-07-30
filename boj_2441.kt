fun main () {
    val n = readln().toInt()
    var s = n
    while (s!=0) {
        for (j in n-1 downTo s)
            print(" ")
        for (i in 1 .. s)
            print("*")
        println()
        s--
    }
}
