fun main () {
    val codeList = mutableListOf<String>()
    while (true){
        val name = readln()
        if (name=="END")
            break
        codeList.add(name)
    }
    codeList.forEach {
        for (i in it.length - 1 downTo 0) {
            print(it[i])
        }
        println()
    }
    // tip : reversed() 사용
}
