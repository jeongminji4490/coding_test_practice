var x = 1
var y = 1

fun main(args: Array<String>) {
    val n = readln().toInt()
    val direction = readln().split(" ").map { it }

    for (d in direction) {
        move(d, n)
    }

    print("$x $y")
}

fun move(direction: String, n: Int) {
    when (direction) {
        "R" -> {
            if (y < n)
                y++
        }
        "L" -> {
            if (y > 1)
                y--
        }
        "U" -> {
            if (x > 1)
                x--
        }
        else -> {
            if (x < n)
                x++
        }
    }
}
