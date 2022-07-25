fun main () {
    val n = readln().split(" ").map { it.toBigInteger() }
    println (
        if (n[0] == n[1]) 1
        else 0
    )
}
