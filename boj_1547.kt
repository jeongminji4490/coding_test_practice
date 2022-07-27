fun main () {
    val l = mutableListOf(1,2,3)
    repeat(readln().toInt()){
        val idx = readln().split(" ").map { it.toInt() }
        if (idx[0] == l[0]) {
            l[0] = idx[1]
        }else if (idx[1] == l[0]){
            l[0] = idx[0]
        }
    }
    println(l[0])
}
