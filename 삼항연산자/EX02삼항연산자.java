package 삼항연산자;

import java.util.Scanner;

public class EX02삼항연산자 {

	public static void main(String[] args) {

		//두개의 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과 값을 출력하세요.
		// 1) 입력하는 도구가 필요하다.
		// 2) 출력문
		// 3) 입력문 - num1에 저장
		// 4) 출력문
		// 5) 입력문 - num2에 저장
		// 6) 두수의 차가 결과값으로 나와야 한다.
		// 큰숫자 - 작은숫자 어떤 수가 더 큰 숫자인지 비교!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 숫자를 입력하시오 : ");
		int num2 = sc.nextInt();
		
		int result = (num1>num2)?(num1-num2):(num2-num1);
		System.out.println("두 수의 차 : " + result);
			
	}

}
