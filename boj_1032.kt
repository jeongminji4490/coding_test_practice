import java.util.*

fun main() {
	
	// 파일 개수
	val n = readln().toInt() // readln == readLine
	// 파일이 담길 리스트
	// mutableListOf : 수정, 삭제가 가능한 리스트, ArrayList와 큰 차이는 없음
	val fileList = mutableListOf<String>()
	var answer = ""

	repeat(n) { // n번 반복
		val file = readln() // 파일명 입력
		fileList.add(file)
    }
	// 파일의 길이는 모두 일정하니 첫번째 파일의 길이를 가져옴
	val length = fileList[0].length // 10
	 
	for (row in 0 until length) { // 파일 길이만큼 반복(0~9)
		var isSame = true
		var lastChar = fileList[0][row] // 첫번째 문자열의 row번째 문자
		for (col in 1 until fileList.size) { 
			
			val curChar = fileList[col][row] 
			if (lastChar != curChar) { 
				isSame = false
				break
			}
        }
		if (isSame) // 첫번째 문자가 동일하다면
			answer += lastChar // 빈 문자열에 문자 넣기
		else  // 동일하지 않다면 
			answer += "?"
	}
	println(answer)
}
