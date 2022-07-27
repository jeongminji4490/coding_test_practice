fun main () {
    val n = readln().toInt() 
    val time = readln().split(" ").map { it.toInt() } 
    var ySum = 0
    var mSum = 0
    time.forEach {
        var y = 0
        y += (it/30) * 10 + 10
        ySum += y
        var m = 0
        m += (it/60) * 15 + 15
        mSum += m
    }
    println(
        if (ySum < mSum) "Y $ySum"
        else if (ySum > mSum) "M $mSum"
        else "Y M $ySum"
    )
}
