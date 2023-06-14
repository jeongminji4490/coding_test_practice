class Solution {
    
    var mode = 0 
    var answer: String = ""
    
    fun solution(code: String): String {
        var code = code.toCharArray()
        
        for (idx in 0 until code.size) {
            setString(code[idx], idx)
        }
        
        return if (answer.isEmpty()) "EMPTY" else answer
    }
    
    fun setString(c: Char, idx: Int) {
        when (mode) {
            0 -> {
                if (c != '1') {
                    if (idx%2 == 0) answer += c
                } else mode = 1
            }
            else -> {
                if (c != '1') {
                    if (idx%2 != 0) answer += c
                } else mode = 0
            }
        }
    }
}
