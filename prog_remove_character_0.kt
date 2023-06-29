class Solution {
    fun solution(my_string: String, indices: IntArray): String = my_string.filterIndexed { idx, item -> !indices.contains(idx) }
}
