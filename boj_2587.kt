fun main () {
    val list = mutableListOf<String>()
    val fbiList = mutableListOf<Int>()
    repeat(5){
        list.add(readln())
    }
    list.forEach {
        if (it.contains("FBI"))
            fbiList.add(list.indexOf(it)+1)
    }
    if (fbiList.isNotEmpty())
        fbiList.forEach { print("$it ") }
    else
        println("HE GOT AWAY!")
}
