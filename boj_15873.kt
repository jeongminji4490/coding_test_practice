fun main () {
    val n = readln()
    var result = 0
    when (n.length) {
        3 -> { // 앞이 두자리, 뒤가 두자리 수인 경우 모두 고려해야함
            if ("${n[2]}" == "0"){ // 앞이 두자리 수
                val str = "${n[1]}${n[2]}"
                result += str.toInt() + n[0].digitToInt()
            }else { // 뒤자 두자리 수
                val str = "${n[0]}${n[1]}"
                result += str.toInt() + n[2].digitToInt()
            }
        }
        4 -> {
            val str1 = "${n[0]}${n[1]}"
            val str2 = "${n[2]}${n[3]}"
            result += str1.toInt() + str2.toInt()
        }
        else -> {
            n.forEach {
                result += it.digitToInt()
            }
        }
    }
    println(result)
}
