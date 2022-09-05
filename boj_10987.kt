fun main () {
    var n = 0
    readln().forEach { 
        when(it) {
            'a' -> n += 1
            'e' -> n += 1
            'i' -> n += 1
            'o' -> n += 1
            'u' -> n += 1
        }
    }
    println(n)
}
