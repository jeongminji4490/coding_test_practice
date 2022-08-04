fun main () {
    repeat(readln().toInt()){
        val c = readln().toInt()
        val q = c / 25
        val d = (c % 25) / 10
        val n = (c % 25 % 10) / 5
        val p = c % 25 % 10 % 5
        println("$q $d $n $p")
    }
}
