class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var array = mutableListOf<Int>()
        
        arr.forEachIndexed { index, item ->
            if (index>=idx && item==1) {
                array.add(index)
            }
        }
        
        array.sorted()
        
        return if (array.isEmpty()) -1 else array.first()
    }
}
