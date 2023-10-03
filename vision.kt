fun main(args: Array<String>) {
    val n = readln().toInt()
    var result = 0

    for (i in 0..n) {
        val isHourContainThree = i.toString().contains("3")

        for (j in 0 until 60) {
            val isMinuteContainThree = j.toString().contains("3")
            for (m in 0 until 60) {
                val isSecondContainThree = m.toString().contains("3")
                if (isHourContainThree || isMinuteContainThree || isSecondContainThree) result++
            }
        }
    }

    println(result)
}
