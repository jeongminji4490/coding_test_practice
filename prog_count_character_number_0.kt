class Solution {
    fun solution(my_string: String): IntArray {
        return (('A' .. 'Z').map { alpha -> my_string.count{ it == alpha } } +
            ('a' .. 'z').map { alpha -> my_string.count{it == alpha} }).toIntArray()
    }
}
