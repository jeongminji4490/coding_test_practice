import java.util.*

fun main(){
    val list = readln().split(" ").map { it.toInt() }

    for (i in 1 until Int.MAX_VALUE){
        var count = 0

        for (index in list.indices){
            if (i % list[index] == 0){
                count++
            }
        }

        if (count >= 3){
            println(i)
            break
        }
    }
}
