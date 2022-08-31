fun main () {
    repeat(readln().toInt()) {
        val n = readln().toInt()
        if (n!=1){
            repeat(n) { print("#") }
            println()
            repeat(n-2){
                for (i in 0 until n){
                    print (
                        if (i == 0 || i == n-1) "#"
                        else "J"
                    )
                }
                println()
            }
            repeat(n) { print("#") }
            println("")
            println()
        }else{
            println("#")
            println()
        }
    }
}
