class Solution {
    fun solution(n: Int, k: Int): List<Int> = (1..n).filter { it -> it%k == 0 }
}
