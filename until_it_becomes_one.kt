fun main(args: Array<String>) {
    var n = readln().toInt()
    val k = readln().toInt()
    var count = 0

    while (n != 1) {
        if (n%k == 0) {
            n /= k
        } else {
            n--
        }
        count++
    }
    print(count)
}
