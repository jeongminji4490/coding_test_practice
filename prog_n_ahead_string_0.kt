class Solution {
    fun solution(my_string: String, n: Int): String = my_string.filterIndexed { idx, i -> idx < n }
}