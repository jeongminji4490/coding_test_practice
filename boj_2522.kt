fun main () {
    val n = readln().toInt()
    val r = (2*n-1)%n
    for (i in 1..n) {
        for (j in i until n)
            print(" ")
        for (j in 1..i)
            print("*")
        println()
    }
    for (i in 1 .. r){
        for (j in 1..i)
            print(" ")
        for (j in i .. r)
            print("*")
        println()
    }
}
