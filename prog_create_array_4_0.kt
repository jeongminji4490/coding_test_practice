class Solution {
    fun solution(arr: IntArray): List<Int> {
        var stk: IntArray = intArrayOf()
        
        var i = 0
        return stk.toMutableList().apply {
            while (i < arr.size) {
                if (this.isEmpty()) {
                    add(arr[i])
                    i++
                } else if (this.isNotEmpty() && (this.last() < arr[i])) {
                    add(arr[i])
                    i++
                } else {
                    removeLast()
                }
            }
        }
    }
}
