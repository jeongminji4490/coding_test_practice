import kotlin.math.*

fun main () {
    repeat(readln().toInt()) {
        val snum = readln().toInt()
        var c = 0 // 학점 수
        var g = 0.0 // 성적
        repeat(snum) {
            val n = readln().split(" ")
            c += n[0].toInt()
            g += (n[0].toDouble() * n[1].toDouble())
        }
        val gpa = ((g/c)*10).roundToInt() / 10f
        println("$c $gpa")
    }
}
