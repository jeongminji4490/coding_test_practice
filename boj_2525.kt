fun main () {
    val t = readln().split(" ").map { it.toInt() }
    var h = t[0]
    var m = t[1]
    val ms = readln().toInt() + m
    if (ms >= 60){ 
        h += ms/60
        m = ms%60
    }else {
        m = ms%60
    }
    if (h >= 24){
        h %= 24
    }
    println("$h $m")
}
