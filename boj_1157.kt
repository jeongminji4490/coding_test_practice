import java.util.*

fun main() {
    val str = readln() 
    val map = mutableMapOf<Char, Int>() // empty map

    str.forEach {
        val char = it.uppercaseChar() // 대문자로 변환

        if (map.containsKey(char)) { // if key has char 
            map[char] = map[char]!!.plus(1) // 해당 key의 value를 1 증가
        }
        else { 
            map[char] = 1 
        }
    }

    val max =  Collections.max(map.values) // get max value

    if (map.filter { it.value == max }.count() > 1) {
        println("?")
    }
    else {
        map.forEach{ (key, value) ->
            if (value == max){ // max value와 현재 value 값이 동일하면 key 저장
                println(key)
            }
        }
    }
}
