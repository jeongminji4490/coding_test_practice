fun main () {
    var n = readln().split(" ").map { it.toInt() }
    val r = readln().lowercase()
    n = n.sorted()
    val a = n[0] 
    val b = n[1] 
    val c = n[2] 
  
    val newArr = r.toCharArray()
    newArr.forEach {
        when (it) {
            'a' -> print("$a ")
            'b' -> print("$b ")
            'c' -> print("$c ")
        }
    }
    println()
}
