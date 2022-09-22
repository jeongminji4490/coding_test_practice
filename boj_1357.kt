 fun main () {
    val n = readln().split(" ")

    val n1 = n[0].reversed().removePrefix("0")
    val n2 = n[1].reversed().removePrefix("0")

    val dec = n1.toInt() + n2.toInt()

    val sdec = dec.toString().reversed().removePrefix("0").toInt()

    println(sdec)
}
