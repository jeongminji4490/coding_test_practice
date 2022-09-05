fun main () {
    val n = readln().split(" ").map { it.toInt() }
    val days = n[0] // 여름의 일 수
    val period = n[1] // 자라는 시간
    var hdate = 1 + period // 수확 날짜
    val ln = n[2] // 칸 수
    val cost = n[3] // 가격
    var fruits = 0 // 개수
    while (hdate <= days) {
        fruits += ln
        hdate += period
    }
    println(fruits * cost)
}
