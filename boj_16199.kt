import java.text.SimpleDateFormat

fun main () {
    val format = SimpleDateFormat("MM dd")
    val birth = readln().split(" ").map { it.toInt() } // 태어난 날짜
    val date = readln().split(" ").map { it.toInt() } // 기준 날짜
    val old = date[0] - birth[0]
    val birthParse = format.parse("${birth[1]} ${birth[2]}")
    val dateParse = format.parse("${date[1]} ${date[2]}")

    // 만 나이
    println(
        if (birthParse.equals(dateParse)) "$old"
        else {
            if (birthParse.before(dateParse)) "$old"
            else {
                if (old > 0) "${old - 1}"
                else "$old"
            }
        }
    )
    println("${old + 1}") // 세는 나이
    println("$old") // 연 나이
}
