fun main () {
    var idxList = mutableListOf<Int>()
    repeat(readln().toInt()){
        var n = readln().toBigInteger().toString(2).toCharArray()
        n = n.reversedArray() 
        val size = n.size - 1
        for (i in size downTo 0){
            if (n[i] == '1'){
                idxList.add(i)
            }
        }
        idxList = idxList.sorted().toMutableList()
        idxList.forEach {
            print("$it ")
        }
        idxList.clear()
        println()
    }
}
