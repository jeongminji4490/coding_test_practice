class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        
    var my_string = my_string
    var str = ""
    while (my_string != "") {
        str += my_string[c-1]
        my_string = my_string.substring(m)
    }
        
    return str
  }
}
