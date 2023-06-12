fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val value = isOddOrEven(a)
    println("$a is $value")
}

fun isOddOrEven(num: Int): String = if (num%2 == 0) "even" else "odd"
