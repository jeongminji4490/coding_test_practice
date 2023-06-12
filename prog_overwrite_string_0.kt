class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val str = my_string.substring(0, s) 
        val ostr = my_string.substring(s + overwrite_string.length, my_string.length)
        var answer: String = str + overwrite_string + ostr
        return answer
    }
}
