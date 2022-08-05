fun main () {
    val a = readln().toBigInteger()
    val o = readln()
    val b = readln().toBigInteger()
    when (o) {
        "+" -> { println(a.add(b)) }
        "*" -> { println(a.multiply(b)) }
    }
}
