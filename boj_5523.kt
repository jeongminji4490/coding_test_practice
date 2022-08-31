fun main () {
    var aw = 0
    var bw = 0
    repeat(readln().toInt()) {
        val score = readln().split(" ").map { it.toInt() }
        if (score[0] > score[1])
            aw += 1
        if (score[1] > score[0])
            bw += 1
    }
    println("$aw $bw")
}
