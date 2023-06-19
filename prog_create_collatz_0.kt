class Solution {
    fun solution(n: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        
        return answer.toMutableList().apply {
            var result = n
            while (result != 1) {
                if (result%2 == 0) {
                    add(result)
                    result /= 2
                } else {
                    add(result)
                    result = 3*result + 1
                }
            }
            add(result)
        }
    }
}
