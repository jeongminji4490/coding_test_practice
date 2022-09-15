fun main () {
    var n = readln().toInt()
    while (n >= 1) {
        if (n%2 != 0) break
        n /= 2
    }
    println(
        if (n == 1) "1"
        else "0"
    )
}
