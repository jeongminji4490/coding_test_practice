fun main () {
    val n = readln().split(" ").map { it.toInt() }
    val idx = n[1] - 1
    val list = mutableListOf<Int>()
    for (i in 1 .. n[0]) {
        if (n[0]%i == 0)
            list.add(i)
    }
    try {
        println(list[idx])
    }catch (e: IndexOutOfBoundsException) {
        println(0)
    }
}
