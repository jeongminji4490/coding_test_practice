class Solution {
    fun solution(l: Int, r: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        
        val srr = answer.toMutableList().apply {
            for (i in l .. r) {
                if (i%5 == 0) {
                    val si = i.toString()
                    var str = si.replace("0", "").replace("5", "")
                    if (str == "") {
                        add(si.toInt())
                    }
                }
            }
        }

        if (srr.isEmpty()) srr.add(-1)
        return srr
    }
}
