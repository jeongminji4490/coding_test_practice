class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()   
        val lastIdx = my_string.length
        
        for (i in 0 until lastIdx) {
            answer += my_string.substring(i, lastIdx)
        }
        
        answer.sort()
        return answer
    }
}
