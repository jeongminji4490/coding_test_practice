import kotlin.collections.HashMap
import kotlin.math.*

fun main () {
    repeat(readln().toInt()){
        val a = HashMap<Int, Int>()
        val copy_a = HashMap<Int, Int>()
        val n = readln().toInt()
        for (i in 1..n){ 
            val r = n-i 
            val t1 = min((n-r),(n-i))
            val t2 = max((n-r),(n-i))
            if (r!=0) {
                if (t1!=t2){
                    a[t1] = t2
                    copy_a[t1] = t2
                }
            }
        }
        print("Pairs for $n: ")
        for ((key, value) in a){
            print("$key $value")
            copy_a.remove(key)
            if (copy_a.isNotEmpty())
                print(", ")
        }
        println()
    }
}
