fun main () {
    val n = readln().toInt()
    var sum = 0
    for (i in 1..n){
        for (j in 0..i){ 
            sum += i
            sum += j
        }
    }
    println(sum)
}
