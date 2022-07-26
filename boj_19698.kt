fun main () {
    val n = readln().split(" ").map { it.toInt() }
    val rooms = (n[1]/n[3]) * (n[2]/n[3])
    println(
        if (rooms > n[0]) n[0] else rooms
    )
}
