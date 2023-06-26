class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {    
        return my_strings.mapIndexed { idx, str ->
            str.substring(parts[idx].first(), parts[idx].last() + 1)
        }.joinToString("")
    }
}
