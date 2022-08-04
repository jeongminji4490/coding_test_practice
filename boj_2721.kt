fun main () {
    repeat(readln().toInt()){
        val n = readln().toInt() 
        var sum = 0
        for (i in 1..n){
            var t = 0
            for (j in 1..i+1){
                t += j
            }
            sum += i*t
        }
        println(sum)
    }
}
