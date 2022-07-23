fun main () {
    val list = mutableListOf<Int>()
    var sum = 0
    repeat(5) {
        list.add(readln().toInt())
    }
    sum += if (list[0] < 0){
        ((0 - list[0]) * list[2]) + list[3] + (list[1] * list[4])
    }else {
        (list[1] - list[0]) * list[4]
    }
    println(sum)
}
