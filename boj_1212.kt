fun main () {
    val octal = readln()
    val octalToBigInteger = octal.toBigInteger(8)
    println(octalToBigInteger.toString(2))
}
