fun main () {
    val n = readln().split(" ").map { it.toInt() }
    if (n[1]-n[2]==n[0]){
        println("${n[0]}=${n[1]}-${n[2]}")
        return
    }
    if(n[1]+n[2]==n[0]){
        println("${n[0]}=${n[1]}+${n[2]}")
        return
    }
    if (n[1]*n[2]==n[0]){
        println("${n[0]}=${n[1]}*${n[2]}")
        return
    }
    if (n[1]/n[2]==n[0]){ 
        println("${n[0]}=${n[1]}/${n[2]}")
        return
    }

    if (n[0]+n[1]==n[2]){
        println("${n[0]}+${n[1]}=${n[2]}")
        return
    }
    if(n[0]-n[1]==n[2]){
        println("${n[0]}-${n[1]}=${n[2]}")
        return
    }
    if (n[0]*n[1]==n[0]){
        println("${n[0]}*${n[1]}=${n[2]}")
        return
    }
    if (n[0]/n[1]==n[0]){ 
        println("${n[0]}/${n[1]}=${n[2]}")
        return
    }
}
