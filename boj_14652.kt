fun main() {
    val list = readln().split(" ").map { it.toInt() }
    println("${list[2]/list[1]} ${list[2]%list[1]}")
}
