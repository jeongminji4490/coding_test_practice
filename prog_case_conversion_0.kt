fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    val newArr = s1.toCharArray()
    newArr.forEach { it ->
        if (it.isUpperCase()) 
            print(it.toLowerCase())
        else 
            print(it.toUpperCase())
    }
}
