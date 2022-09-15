fun main () {
    repeat(readln().toInt()) {
        var result = 1
        val n = readln().split(" ").map { it.toInt() }
        for (i in 1 .. n[1]) {
            result = result * n[0] % 10
        }
        println(
            if (result == 0) "10"
            else result
        )
    }
}
