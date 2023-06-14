class Solution {
    fun solution(num_list: IntArray): Int {

        var n1 = num_list.reduce { a, b -> a * b }
        var n2 = num_list.sum() * num_list.sum() 

        return if (n1 < n2) 1 else 0
    }
}
