class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {

        val str1 = my_string.substring(0, s)
        val str3 = my_string.substring(e+1, my_string.length)
        val str2 = my_string.substring(s, e+1).reversed()
        
        return str1 + str2 + str3
    }
}
