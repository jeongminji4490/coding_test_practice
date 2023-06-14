class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.toMutableList().apply {
            val (a, b) = num_list.takeLast(2)
            if (b > a) add(b-a) else add(b*2)
        }
        
        return answer.toIntArray()
    }
}
