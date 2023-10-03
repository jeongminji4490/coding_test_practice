fun main(args: Array<String>) {

    val list = mutableListOf(2, 4, 5, 4, 6)
    val sorted = list.sortedByDescending { it } // 6, 5, 4, 4, 2

    val m = 8
    val k = 3
    var count = 0
  
    count = m/(k+1)*k 
    count += m%(k+1) 

    val first = sorted[0] * count 
    val second = (m-count) * sorted[1] 

    println(first+second)
}
