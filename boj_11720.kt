fun main () {
    var sum = 0
    var num = readln().toInt()
    val list = readln()
    list.forEach {
        sum += Character.getNumericValue(it)
    }
    println(sum)
    // Character.getNumericValue(char) : 문자를 정수로 변환
}
