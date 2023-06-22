class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var str = my_string

        queries.forEach { query ->
            val idx1 = query[0] 
            val idx2 = query[1] 
            val fStr = str.substring(0, idx1)
            val lStr = str.substring(idx2+1, str.length)
            val n = str.substring(idx1, idx2+1)

            val reversedString = n.reversed()

            str = fStr+reversedString+lStr
        }

        return str
    }
}
