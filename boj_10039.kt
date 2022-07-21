fun main () {
    var sum = 0
    repeat(5) {
        val score = readln().toInt()
        sum += if (score > 40) score else 40
    }
    println(sum / 5)
}
