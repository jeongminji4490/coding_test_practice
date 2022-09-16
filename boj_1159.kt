fun main () {
    val map = mutableMapOf<Char, Int>()
    val list = mutableListOf<Char>()
    repeat(readln().toInt()) {
        map.merge(readln()[0], 1) { old, value ->
            old + value
        }
    }
    map.map {
        if (it.value >= 5)
            list.add(it.key)
    }
    if (list.isNotEmpty()) {
        list.sort()
        list.forEach {
            print("$it")
        }
    }else println("PREDAJA")
}
