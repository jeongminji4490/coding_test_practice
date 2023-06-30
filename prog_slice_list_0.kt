class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        val a = slicer[0]
        val b = slicer[1]
        val c = slicer[2]
        
        when (n) {
            1 -> {
                answer = num_list.slice(0..b).toIntArray()
            }
            2 -> {
                answer = num_list.slice(a..num_list.lastIndex).toIntArray()
            }
            3 -> {
                answer = num_list.slice(a..b).toIntArray()
            }
            4 -> {
                for (i in a..b step(c)) {
                    answer += num_list[i]
                }
            }
        }
        
        return answer
    }
}
