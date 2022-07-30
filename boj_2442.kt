fun main () {
    val n = readln().toInt() 
    var s = 1

    while(s<=n) { 
        val sp = ((2*n-1)-(2*s-1))/2 
        for (i in 1..sp)
            print(" ")
        for (i in (2*s-1) downTo 1){
            print("*")
        }
        println()
        s++
    }
}
