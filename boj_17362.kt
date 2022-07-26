fun main () {
    val n = (readln().toInt() - 1) % 8
    
    println(
        when (n) {
            0 -> 1
            1, 7 -> 2
            2, 6 -> 3
            3, 5 -> 4
            else -> 5
        }
    )
}
