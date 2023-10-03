fun main(args: Array<String>) {
    val n = readln()
    var result = 0
  
    val loc = n.split("").filter { it != "" }
    val x = changeCharToInt(loc[0]) 
    val y = loc[1].toInt() 

    if (x+2<=8 && y+1<=8) result++
    if (x-2>=1 && y+1<=8) result++
    if (x+2<=8 && y-1>=1) result++
    if (x-2>=1 && y-1>=1) result++

    if (y+2<=8 && x+1<=8) result++
    if (y-2>=1 && x+1<=8) result++
    if (y+2<=8 && x-1>=1) result++
    if (y-2>=1 && x-1>=1) result++

    println(result)
}

fun changeCharToInt(c: String): Int {
    return when (c) {
        "a" -> 1
        "b" -> 2
        "c" -> 3
        "d" -> 4
        "e" -> 5
        "f" -> 6
        "g" -> 7
        else -> 8
    }
}
