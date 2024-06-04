import java.util.Scanner;    //java.util = 경로, import = 사용하겠다 선언

public class Ex00입력문 {

	//main 체크를 안했을 경우
	//main +ctrl + 스페이스바
	public static void main(String[] args) {
	
		//1)도구 불러오기
		Scanner sc = new Scanner(System.in); 
		//Scanner라는 기능을 sc라는 이름으로 사용
		//new : 새롭게 기능을 탄생시키는 키워드
		//System - console
		// out/in - 데이터가 들어오거나 출력되는지 여부
		
		sc.next(); //콘솔창에 입력할수 있음
	}

}
