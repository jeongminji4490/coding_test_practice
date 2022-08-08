import kotlin.math.*

fun main () {
    while (true){
        val l = readln().split(" ").map { it.toInt() }
        if (l[0]==0 && l[1]==0 && l[2]==0)
            break
        val ap = (l[0].toDouble()).pow(2)
        val bp = (l[1].toDouble()).pow(2)
        val cp = (l[2].toDouble()).pow(2)

        if (ap+bp == cp || ap+cp == bp || cp+bp == ap)
            println("right")
        else
            println("wrong")
    }
}
