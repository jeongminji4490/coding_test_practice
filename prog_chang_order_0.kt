class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.copyOfRange(n, num_list.size) + num_list.copyOfRange(0, n) 
}
