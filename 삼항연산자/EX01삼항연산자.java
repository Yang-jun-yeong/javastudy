package 삼항연산자;

import java.util.Scanner;

public class EX01삼항연산자 {

	public static void main(String[] args) {
		
		//사용자로부터 정수를 하나 입력 받아서 홀수인지 짝수인지 판별
		
		// 1) 입력하는 도구 가져오기
		
		// 2) 출력문
		
		// 3) 사용자한테 숫자 하나 입력 받기 (num)
		
		// 4) num이라는 숫자가 홀수 /짝수 인지 삼항연산자를 사용하여 결과값을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num/2==0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		System.out.println((num/2==0)?(num+"는(은) 짝수입니다"):(num+"는(은) 홀수입니다"));
		
		// 결과 담길 변수를 따로 만들어서 진행하는 방법!
		String result = num%2 == 1? "홀수":"짝수";
		System.out.println(result);
	}

}
