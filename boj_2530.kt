fun main () {
    val curTime = readln().split(" ").map { it.toInt() }
    val cookTime = readln().toInt()
    var h = curTime[0]
    var m = curTime[1]
    var s = curTime[2]

    s += cookTime%60 
    m += cookTime/60 + s/60 
    s %= 60 

    h += m / 60
    m %= 60

    h %= 24
    println("$h $m $s")
}
